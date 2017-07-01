package problems.easy.binaryTreePaths;

import shared.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */
public class BinaryTreePaths {

    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if (root == null) return paths;
        if (root.left == null && root.right == null) {
            paths.add(root.val + "");
            return paths;
        }

        for (String path : binaryTreePaths(root.left))
            paths.add(root.val + "->" + path);


        for (String path : binaryTreePaths(root.right))
            paths.add(root.val + "->" + path);


        return paths;
    }
}
