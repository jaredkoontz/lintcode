package problems.medium.medium.problems.medium.generateParenthesis;


import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	/**
	 * @param n n pairs
	 * @return All combinations of well-formed parentheses
	 */
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<>();
		backtrack(list, "", 0, 0, n);
		return list;
	}

	private void backtrack(List<String> list, String str, int open, int close, int max) {

		if (str.length() == max * 2) {
			list.add(str);
			return;
		}

		if (open < max)
			backtrack(list, str + "(", open + 1, close, max);
		if (close < open)
			backtrack(list, str + ")", open, close + 1, max);
	}
}
