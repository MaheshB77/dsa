package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Fibonacci series using recursion
 * -> Mathematical formula for Fibonacci series is f(n) = f(n-1) + f(n-2)
 */
public class _05Example {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
