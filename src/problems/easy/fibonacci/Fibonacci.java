package problems.easy.fibonacci;

public class Fibonacci {

	public int fibonacciNaive(int n) {
		if (n < 3)
			return n == 2 ? 1 : 0;
		else
			return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
	}

	public int fibonacci(int n) {
		if (n < 3)
			return n == 2 ? 1 : 0;

		int[] matrix = new int[n+1];

		matrix[0] = 0;
		matrix[1] = 0;
		matrix[2] = 1;


		for (int i = 3; i < matrix.length; i++) {
			matrix[i] = matrix[i - 1] + matrix[i - 2];
		}

		return matrix[n];
	}
}

