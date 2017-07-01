package problems.medium.pow;

/**
 * @author koontz
 */
public class Pow {

// Time:  O(logn)
// Space: O(logn)

    /**
     * @param x the base number
     * @param n the power number
     * @return the result
     */
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        return myPowRecursive(x, n);
    }

    private double myPowRecursive(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n % 2 == 0) {
            return myPowRecursive(x * x, n / 2);
        } else {
            return x * myPowRecursive(x * x, n / 2);
        }
    }

}
