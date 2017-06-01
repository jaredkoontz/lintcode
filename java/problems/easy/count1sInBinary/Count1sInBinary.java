package problems.easy.count1sInBinary;

/**
 * @author koontz
 */
public class Count1sInBinary {


	/**
	 * @param num: an integer
	 * @return: an integer, the number of ones in num
	 */
	public int countOnes(int num) {
		int count = 0;
		for (; num != 0; num &= num - 1) {
			++count;
		}
		return count;
	}
}
