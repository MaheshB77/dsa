package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Exponent (m)^n
 */
public class _03Example {

    /**
     * Solution 1
     * pow(m, n) = m * m * .... * for n times
     * pow(m, n) = (m * m * .... * n -1 times) * m
     * pow(m, n) = pow(m, n-1) * m
     *
     * Notes :
     * 1. Time complexity => O(n)
     * 2. Space complexity => O(n)
     */
    static int pow1(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return pow1(m, n-1) * m;
        }
    }

    /**
     * Solution 2
     * For even power :
     * 2^4 = (2^2)^2
     * i.e m^n = pow(m*m, n/2)
     *
     * For odd power :
     * 2^5 = 2 * (2^2)^2
     * i.e m^n = m * pow(m*m, n/2)
     *
     * Notes :
     * 1. Time complexity => O(log(n))
     * 2. Space complexity => O(log(n))
     */
    static int pow2(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return pow2(m * m, n/2);
        } else {
            return m * pow2(m * m, n/2);
        }
    }

    public static void main(String[] args) {
        System.out.println("1st approach => " + pow1(2, 5));
        System.out.println("2nd approach => " + pow2(2, 5));
    }
}
