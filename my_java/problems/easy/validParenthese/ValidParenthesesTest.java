package problems.easy.validParenthese;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author koontz
 */

public class ValidParenthesesTest {

	@Test
	public void happyPath() {
		String paren = "()";
		ValidParentheses validParentheses = new ValidParentheses();
		assertTrue(validParentheses.isValidParentheses(paren));
		paren = "()[]{}";
		assertTrue(validParentheses.isValidParentheses(paren));
		paren = "(]";
		assertFalse(validParentheses.isValidParentheses(paren));
		paren = "([)]";
		assertFalse(validParentheses.isValidParentheses(paren));
	}

}
