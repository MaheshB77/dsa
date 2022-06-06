package concepts._01Recursion;

/**
 * @author Mahesh
 * In Nested Recursion, a recursive function will pass
 * a parameter as recursive call
 */
public class _07NestedRecursion {

    static int fun(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return fun(fun(n + 11));
        }
    }

    public static void main(String[] args) {
        System.out.println(fun(95));
    }
}
