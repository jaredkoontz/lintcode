package problems.easy.addBinary;

/**
 * @author koontz
 */
public class AddBinary {
// Time:  O(n)
// Space: O(1)

	/**
	 * @param a a number
	 * @param b a number
	 * @return the result
	 */
	String addBinary(String a, String b) {
		String result = "";
		int result_length = Math.max(a.length(), b.length());

		int carry = 0;
		for (int i = 0; i < result_length; ++i) {
			int a_bit_i = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
			int b_bit_i = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
			int sum = carry + a_bit_i + b_bit_i;
			carry = sum / 2;
			sum %= 2;
			result += sum;
		}
		if (carry == 1) {
			result += carry;
		}
		return new StringBuilder(result).reverse().toString();
	}
}