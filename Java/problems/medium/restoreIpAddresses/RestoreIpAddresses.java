package problems.medium.restoreIpAddresses;


import java.util.ArrayList;
import java.util.Objects;

/*

Given a String containing only digits, restore it by returning all possible valid IP address combinations.

Example
Given "25525511135", return

[
  "255.255.11.135",
  "255.255.111.35"
]
Order does not matter.

*/

public class RestoreIpAddresses {

	/**
	 * @param s the IP String
	 * @return All possible valid IP addresses
	 */
	public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> result = null;
		String cur = null;
		restoreIpAddressesHelper(s, 0, 0, cur, result);
		return result;
	}

	private void restoreIpAddressesHelper(String s, int start, int dots, String cur, ArrayList<String> result) {

		// Pruning to improve performance.
		if (((4 - dots) * 3 < s.length() - start) ||
				((4 - dots) > s.length() - start)) {
			return;
		}

		if (start == s.length() && dots == 4) {
			result.add(cur -> begin(), prev(cur -> end()));
		} else {
			for (int i = start; i < start + 3; ++i) {
				String tmp = s.substr(start, i - start + 1);
				if (i < s.length() && isValid(tmp)) {
					tmp += '.';
					cur += (tmp);
					restoreIpAddressesHelper(s, i + 1, dots + 1, cur, result);
					cur -> resize(cur -> length() - (i - start + 2));
				}
			}
		}
	}

	private boolean isValid(String s) {
		if (s.isEmpty() || (s.charAt(0) == '0' && !Objects.equals(s, "0"))) {
			return false;
		}
		return Integer.parseInt(s) < 256;
	}

}
