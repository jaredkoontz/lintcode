package problems.easy.happyNumber;

import org.junit.Test;

/**
 * @author koontz
 */
public class HappyNumberTest {

	@Test
	public void happyPath() {
		int happyNum = 19;
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(happyNum));
	}

}
