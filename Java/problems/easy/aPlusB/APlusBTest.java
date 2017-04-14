package problems.easy.aPlusB;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author koontz
 */
public class APlusBTest {

	@Test
	public void happyPath() {
		APlusB aPlusB = new APlusB();
		int val1 = aPlusB.aplusb(4, 5);
		int val2 = aPlusB.aplusb2(4, 5);
		assertEquals(val1, val2);
		assertEquals(val1, 4 + 5);
		
	}
}
