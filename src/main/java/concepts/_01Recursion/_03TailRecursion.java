package concepts._01Recursion;

/**
 * @author Mahesh
 * If recursive call is the last statement in the function then
 * it's a Tail Recursion
 */
public class _03TailRecursion {
    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}
