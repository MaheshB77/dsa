package concepts._01Recursion;

/**
 * @author Mahesh
 * If recursive call is the first statement in the function then
 * it's a Head Recursion
 */
public class _04HeadRecursion {
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}
