package concepts._02Arrays.problems;

/**
 * Linear search
 * - Best time complexity => O(1)
 * - Worst time complexity => O(n)
 */
public class _01Problem {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 7, 1, 9, 6};
        int target = 1;
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
