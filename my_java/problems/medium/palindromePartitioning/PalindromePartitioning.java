package problems.medium.palindromePartitioning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author koontz
 */
public class PalindromePartitioning {

	// Time:  O(n * 2^n)
	// Space: O(n)

	//dfs solution

	/**
	 * @param s: A String
	 * @return: A list of lists of String
	 */
	public List<List<String>> partition(String s) {

		List<List<String>> result = new ArrayList<>();
		LinkedList<String> partition = new LinkedList<>();
		palindromePartitioningHelper(s, 0, partition, result);
		return result;
	}

	private void palindromePartitioningHelper(String s, int begin, LinkedList<String> partition,
	                                          List<List<String>> result) {
		//stop condition
		if (begin == s.length()) {
			ArrayList<String> temp = new ArrayList<String>(partition);
			result.add(temp);
			return;
		}

		for (int i = begin + 1; i <= s.length(); i++) {
			String str = s.substring(begin, i);
			if (isPalindrome(str)) {
				partition.add(str);
				palindromePartitioningHelper(s, i, partition, result);
				partition.remove(partition.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}


	//dynamic programming
	public List<String> palindromePartitioningDP(String s) {

		List<String> result = new ArrayList<>();

		if (s == null)
			return result;

		if (s.length() <= 1) {
			result.add(s);
			return result;
		}

		int length = s.length();

		int[][] table = new int[length][length];

		// l is length, i is index of left boundary, j is index of right boundary
		for (int l = 1; l <= length; l++) {
			for (int i = 0; i <= length - l; i++) {
				int j = i + l - 1;
				if (s.charAt(i) == s.charAt(j)) {
					if (l == 1 || l == 2) {
						table[i][j] = 1;
					} else {
						table[i][j] = table[i + 1][j - 1];
					}
					if (table[i][j] == 1) {
						result.add(s.substring(i, j + 1));
					}
				} else {
					table[i][j] = 0;
				}
			}
		}

		return result;
	}




}