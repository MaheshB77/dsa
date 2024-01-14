package concepts._02Arrays.problems;

/**
 * Check if an array is sorted or not
 * - Time complexities
     - Best time complexity => O(n)
     - Worst time complexity => O(n)
 */
public class _03Problem {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 6, 8, 10, 15, 18, 25};
        System.out.println(isSorted(arr));

        arr = new int[] {3, 6, 6, 8, 10, 15, 18, 25};
        System.out.println(isSorted(arr));

        arr = new int[] {3, 7, 6, 8, 10, 15, 18, 25};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < 0 ) {
                return false;
            }
        }
        return true;
    }
}
