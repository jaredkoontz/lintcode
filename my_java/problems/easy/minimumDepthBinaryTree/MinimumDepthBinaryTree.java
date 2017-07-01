package problems.easy.minimumDepthBinaryTree;

import shared.TreeNode;

/**
 * @author koontz
 */
public class MinimumDepthBinaryTree {
// Time:  O(n)
// Space: O(h)

    /*
     * @param root: The root of binary tree.
     * @return: An integer
     */
    int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Both children exist.
        if (root.left != null && root.right != null) {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        } else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
