package problems.medium.pow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author koontz
 */
public class PowTest {

	@Test
	public void happyPath() {
		double x;
		int n;
		Pow pow = new Pow();

		x = 2.1;
		n = 3;

		assertEquals(pow.myPow(x, n), Math.pow(x, n), 0.001);

		x = 0;
		n = 1;
		assertEquals(pow.myPow(x, n), Math.pow(x, n), 0.001);

		x = 1;
		n = 0;
		assertEquals(pow.myPow(x, n), Math.pow(x, n), 0.001);

	}

}
