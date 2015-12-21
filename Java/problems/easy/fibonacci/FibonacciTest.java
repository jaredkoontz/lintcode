package problems.medium.medium.problems.easy.fibonacci;


import org.junit.Test;

public class FibonacciTest {

	@Test
	public void happyPathNaive() {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacciNaive(0));
		System.out.println(f.fibonacciNaive(1));
		System.out.println(f.fibonacciNaive(2));
		System.out.println(f.fibonacciNaive(3));
		System.out.println(f.fibonacciNaive(4));
		System.out.println(f.fibonacciNaive(5));
		System.out.println(f.fibonacciNaive(6));
		System.out.println(f.fibonacciNaive(7));
		System.out.println(f.fibonacciNaive(8));
		System.out.println(f.fibonacciNaive(9));
		System.out.println(f.fibonacciNaive(10));
		System.out.println(f.fibonacciNaive(11));
		System.out.println(f.fibonacciNaive(12));
		System.out.println(f.fibonacciNaive(13));
		System.out.println(f.fibonacciNaive(14));
		System.out.println(f.fibonacciNaive(15));
		System.out.println(f.fibonacciNaive(16));
		System.out.println(f.fibonacciNaive(17));
		System.out.println(f.fibonacciNaive(18));
		System.out.println(f.fibonacciNaive(19));
		System.out.println(f.fibonacciNaive(20));

	}

	@Test
	public void happyPathDP() {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacci(0));
		System.out.println(f.fibonacci(1));
		System.out.println(f.fibonacci(2));
		System.out.println(f.fibonacci(3));
		System.out.println(f.fibonacci(4));
		System.out.println(f.fibonacci(5));
		System.out.println(f.fibonacci(6));
		System.out.println(f.fibonacci(7));
		System.out.println(f.fibonacci(8));
		System.out.println(f.fibonacci(9));
		System.out.println(f.fibonacci(10));
		System.out.println(f.fibonacci(11));
		System.out.println(f.fibonacci(12));
		System.out.println(f.fibonacci(13));
		System.out.println(f.fibonacci(14));
		System.out.println(f.fibonacci(15));
		System.out.println(f.fibonacci(16));
		System.out.println(f.fibonacci(17));
		System.out.println(f.fibonacci(18));
		System.out.println(f.fibonacci(19));
		System.out.println(f.fibonacci(20));

	}

}
