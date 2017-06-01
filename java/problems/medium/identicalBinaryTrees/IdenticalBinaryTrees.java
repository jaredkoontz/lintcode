package problems.medium.identicalBinaryTrees;

import shared.TreeNode;

/**
 * @author koontz
 */
public class IdenticalBinaryTrees {
// Time:  O(n)
// Space: O(h)


	/**
	 * @param a, b, the root of binary trees.
	 * @return true if they are identical, or false.
	 */
	boolean isIdentical(TreeNode a, TreeNode b) {
		if (a == null && b == null) {
			return true;
		}
		if (a != null && b != null) {
			return a.val == b.val &&
					isIdentical(a.left, b.left) &&
					isIdentical(a.right, b.right);
		}
		return false;
	}
}