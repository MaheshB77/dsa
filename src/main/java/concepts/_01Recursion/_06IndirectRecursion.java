package concepts._01Recursion;

/**
 * @author Mahesh
 * If more than one functions are calling each other
 * in circular way then it's an Indirect Recursion
 */
public class _06IndirectRecursion {

    static void funA(int n) {
        if (n > 0) {
            System.out.println(n);
            funB(n - 1);
        }
    }

    static void funB(int n) {
        if (n > 1) {
            System.out.println(n);
            funA(n / 2);
        }
    }

    public static void main(String[] args) {
        funA(10);
    }
}
