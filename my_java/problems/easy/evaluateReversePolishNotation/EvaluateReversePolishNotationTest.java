package problems.easy.evaluateReversePolishNotation;

import org.junit.jupiter.api.Test;

/**
 * @author koontz
 */
public class EvaluateReversePolishNotationTest {

	@Test
	public void happyPath() {
		EvaluateReversePolishNotation reversePolishNotation = new EvaluateReversePolishNotation();
		String[] tokens = new String[]{"2", "1", "+", "3", "*"}; // -> ((2 + 1) * 3) -> 9
		System.out.println(reversePolishNotation.evalRPN(tokens));
		tokens = new String[]{"4", "13", "5", "/", "+"}; // -> (4 + (13 / 5)) -> 6
		System.out.println(reversePolishNotation.evalRPN(tokens));
	}

}
