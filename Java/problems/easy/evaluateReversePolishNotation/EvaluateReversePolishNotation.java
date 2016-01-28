package problems.easy.evaluateReversePolishNotation;

import java.util.Stack;

/**
 * @author koontz
 */
public class EvaluateReversePolishNotation {
// Time:  O(n)
// Space: O(n)

	/**
	 * @param tokens The Reverse Polish Notation
	 * @return the value
	 */
	public int evalRPN(String[] tokens) {
		// Write your code here
		if (tokens.length == 0) {
			return 0;
		}
		Stack<String> s = new Stack<>();
		for (String tok : tokens) {
			if (!is_operator(tok)) {
				s.push(tok);
			} else {
				int y = Integer.valueOf(s.pop());
				int x = Integer.valueOf(s.pop());
				if (tok.charAt(0) == '+') {
					x += y;
				} else if (tok.charAt(0) == '-') {
					x -= y;
				} else if (tok.charAt(0) == '*') {
					x *= y;
				} else {
					x /= y;
				}
				s.push(String.valueOf((x)));
			}
		}
		return Integer.valueOf(s.peek());
	}

	boolean is_operator(String op) {
		return op.length() == 1 && "+-*/".contains(op);
	}
}
