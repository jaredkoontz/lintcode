package problems.easy.rotateString;

/**
 * @author offsetoontz
 */
public class RotateString {
	// Time:  O(n)
	// Space: O(n)

	/**
	 * @param A: A String
	 * @param offset: Rotate String with offset.
	 * @return: Rotated String.
	 */
	String rotateStringImmutable(String A, int offset) {
		if (offset == 0) return A;
		if (A.length() != 0) {
			String result;
			offset %= A.length();
			String subString = A.substring(A.length() - offset);
			result = subString + A.substring(0, A.length() - offset);
			return result;
		}
		return A;
	}

	// Time:  O(n)
	// Space: O(1)

	/**
	 * @param str:    an array of char
	 * @param offset: an integer
	 * @return: nothing
	 */
	public void rotateString(char[] str, int offset) {
		if (str.length != 0) {
			offset %= str.length;
			reverse(str, 0, str.length - 1);
			reverse(str, 0, offset - 1);
			reverse(str, offset, str.length - 1);
		}
	}

	public void reverse(char[] str, int start, int end) {
		while (start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}
	
}