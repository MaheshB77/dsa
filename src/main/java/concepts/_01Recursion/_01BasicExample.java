package concepts._01Recursion;

/**
 * @author Mahesh
 */
public class _01BasicExample {
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
