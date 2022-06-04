package concepts._01Recursion;

/**
 * @author Mahesh
 * If recursive function is calling itself more than one time
 * then it's a Tree Recursion
 */
public class _05TreeRecursion {
    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}
