package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Taylor series using recursion
 */
public class _04Example {
    static int p = 1;
    static int f = 1;

    static int e(int x, int n) {
        int r;
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
