package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Factorial of a number
 * -> fact(n) = 1 * 2 * 3 * 4 * .... * n
 * -> fact(n) = 1 * 2 * 3 * 4 * .... * (n -1) * n
 * -> fact(n) = fact(n -1) * n
 *
 * Notes :
 * 1. Time complexity => O(n)
 * 2. Space complexity => O(n)
 */
public class _02Example {

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
