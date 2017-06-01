package problems.easy.minimumDepthBinaryTree;

import org.junit.Test;
import shared.MarshalAndUnmarshalBinTree;
import shared.TreeNode;

/**
 * @author koontz
 */
public class MinimumDepthBinaryTreeTest {

	@Test
	public void happyPath() {
		String treeString = "1,#,2,3";
		TreeNode root = MarshalAndUnmarshalBinTree.unmarshal(treeString);
		MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
		System.out.println(minimumDepthBinaryTree.minDepth(root));

		treeString = "1,2,#,#,3,4,#,#,5";
		root = MarshalAndUnmarshalBinTree.unmarshal(treeString);
		System.out.println(minimumDepthBinaryTree.minDepth(root));
	}

}
