package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Sum of first 'n' natural numbers
 * -> sum(n) = 1 + 2 + 3 + 4 + .... + n
 * -> sum(n) = 1 + 2 + 3 + 4 + .... + (n -1) + n
 * -> sum(n) = sum(n -1) + n
 *
 * Notes :
 * 1. Time complexity => O(n)
 * 2. Space complexity => O(n)
 */
public class _01Example {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
