package problems.medium.generateParenthesis;


import org.junit.Test;

public class GenerateParenthesisTest {

	@Test
	public void happyPath() {
		GenerateParenthesis g = new GenerateParenthesis();
		System.out.println(g.generateParenthesis(1));
		System.out.println(g.generateParenthesis(2));
		System.out.println(g.generateParenthesis(3));
		System.out.println(g.generateParenthesis(4));
		System.out.println(g.generateParenthesis(5));
	}

}
