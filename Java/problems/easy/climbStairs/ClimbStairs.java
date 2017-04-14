package problems.easy.climbStairs;


public class ClimbStairs {
	public int climbStairs(int n) {
		if (n == 0) return 1;
		if (n < 3) return n;
		int[] matrix = new int[n];

		matrix[0] = 1;
		matrix[1] = 2;

		for (int i = 2; i < matrix.length; i++) {
			matrix[i] = matrix[i - 1] + matrix[i - 2];
		}

		return matrix[n - 1];
	}

	public int climbStairsNaive(int n) {
		if (n < 3) {
			return n;
		}
		return climbStairsNaive(n - 1) + climbStairsNaive(n - 2);
	}
}