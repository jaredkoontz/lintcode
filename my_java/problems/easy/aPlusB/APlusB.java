package problems.easy.aPlusB;

/**
 * @author koontz
 */
// Time:  O(logn) = O(32)
// Space: O(1)
public class APlusB {
    /*
     * @param b: The second integer
     * @return: The sum of a and b
     */
    int aplusb(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }


    /*
     * @param a: The first integer
     * @param b: The second integer
     * @return: The sum of a and b
     */
    int aplusb2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return aplusb2(a ^ b, (a & b) << 1);
    }


}
