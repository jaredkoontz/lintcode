package problems.easy.happyNumber;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author koontz
 */
public class HappyNumber {
	/**
	 * @param n an integer
	 * @return true if this is a happy number or false
	 */
	boolean isHappy(int n) {
		Set<Integer> visited = new HashSet<>();
		while (n != 1 && !visited.contains(n)) {
			visited.add(n);
			n = nextNumber(n);
		}
		return n == 1;
	}

	int nextNumber(int n) {
		int sum = 0;
		while (n != 0) {
			sum += Math.pow(n % 10, 2);
			n /= 10;
		}
		return sum;
	}
}
