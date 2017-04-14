package problems.easy.cosineSim;

/**
 * @author koontz
 */
public class CosineSimilarity {

	// Time:  O(n)
// Space: O(1)

	/**
	 * @param A: An integer array.
	 * @param B: An integer array.
	 * @return: Cosine similarity.
	 */
	public double cosineSimilarity(int[] A, int[] B) {
		double invalid = 2.0;
		if (A.length != B.length) {
			return invalid;
		}

		double A_dot_B = 0.0, A_dot_A = 0.0, B_dot_B = 0.0;
		for (int i = 0; i < A.length; ++i) {
			A_dot_B += A[i] * B[i];
			A_dot_A += A[i] * A[i];
			B_dot_B += B[i] * B[i];
		}

		if (A_dot_A != 0 && B_dot_B != 0)
			return A_dot_B / Math.sqrt(A_dot_A) / Math.sqrt(B_dot_B);
		else
			return invalid;
	}

}
