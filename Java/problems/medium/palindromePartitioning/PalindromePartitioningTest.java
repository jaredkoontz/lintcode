package problems.medium.palindromePartitioning;

import org.junit.Test;

/**
 * @author koontz
 */
public class PalindromePartitioningTest {

	@Test
	public void happyPath() {
		PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
		String s = "aab";
		System.out.println(palindromePartitioning.partition(s));
		System.out.println(palindromePartitioning.palindromePartitioningDP(s));
	}

}
