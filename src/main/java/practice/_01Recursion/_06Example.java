package practice._01Recursion;

/**
 * @author Mahesh
 * Q. Tower of hanoi
 * Rules :
 *      1. We have to transfer all disks from tower A to C
 *      2. One disk at a time can be moved
 *      3. We can not put larger disk on smaller disk
 * Time complexity of TOH using recursion is O(2^n)
 */
public class _06Example {
    static int step = 0;

    static void TOH(int n, int A, int B, int C) {
        if (n > 0) {
            TOH(n-1, A, C, B);
            System.out.println("From " + A + " to " + C + " Step = " + (++step));
            TOH(n-1, B, A, C);
        }
    }

    public static void main(String[] args) {
        TOH(4, 1, 2, 3);
    }
}
