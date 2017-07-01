package shared;

import java.util.StringTokenizer;


/**
 * @author koontz
 */
public class MarshalAndUnmarshalBinTree {

    public static final String SPLITTER = ",";
    public static final String NULL_NODE = "#";

    public static String marshal(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        marshal(root, sb);
        return sb.toString();
    }

    private static void marshal(TreeNode x, StringBuilder sb) {
        if (x == null) {
            sb.append(NULL_NODE);
        } else {
            sb.append(x.val).append(SPLITTER);
            marshal(x.left, sb);
            marshal(x.right, sb);
        }
    }

    public static TreeNode unmarshal(String s) {
        if (s == null || s.length() == 0) return null;
        StringTokenizer st = new StringTokenizer(s, SPLITTER);
        return unmarshal(st);
    }

    private static TreeNode unmarshal(StringTokenizer st) {
        if (!st.hasMoreTokens())
            return null;
        String val = st.nextToken();
        if (val.equals(NULL_NODE))
            return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = unmarshal(st);
        root.right = unmarshal(st);
        return root;
    }
}
