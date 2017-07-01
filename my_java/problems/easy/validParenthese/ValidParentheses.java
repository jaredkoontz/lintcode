package problems.easy.validParenthese;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author koontz
 */
public class ValidParentheses {
// Time:  O(n)
// Space: O(n)

    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        HashMap<Character, Character> symbolPair = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> parentheses = new Stack<>();
        for (Character c : s.toCharArray()) {
            Character closingBrace = symbolPair.get(c);
            if (closingBrace != null) {
                if (parentheses.empty() ||
                        parentheses.peek() != closingBrace) {
                    return false;
                }
                parentheses.pop();
            } else {
                parentheses.push(c);
            }
        }
        return parentheses.empty();
    }
}