package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Taylor series using recursion
 */
public class _04Example {
    static double p = 1;
    static double f = 1;

    static double e(double x, double n) {
        double r;
        if (n == 0) {
            return 1;
        } else {
            r = e(x, n-1);
            p = p * x;
            f = f * n;
            return (r + p/f);
        }
    }
    public static void main(String[] args) {
        System.out.println(e(2, 5));
    }
}
