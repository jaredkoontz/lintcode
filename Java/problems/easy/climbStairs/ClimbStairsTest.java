package problems.easy.climbStairs;

import org.junit.Test;

/**
 * @author koontz
 */
public class ClimbStairsTest {

	@Test
	public void happyPath() {
		ClimbStairs c = new ClimbStairs();
		System.out.println(c.climbStairs(3));

	}

	@Test
	public void naiveTest(){
		ClimbStairs c = new ClimbStairs();
		System.out.println(c.climbStairsNaive(3));
	}

}
