package concepts._02Arrays.problems;

/**
 * Find single missing element
 * - Time complexities
 */
public class _04Problem {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 6, 7, 8, 9};
        System.out.println(findMissing(arr));

        arr = new int[] {3, 4, 5, 6, 8, 9};
        System.out.println(findMissing2(arr));
    }

    // 1st approach
    public static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != 1)
                return arr[i] + 1;
        }
        return -1;
    }

    // 2nd approach
    public static int findMissing2(int[] arr) {
        int diff = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - i) != diff) {
                return arr[i] - 1;
            }
        }
        return -1;
    }
}
