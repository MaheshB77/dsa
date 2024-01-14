package concepts._02Arrays.problems;

/**
 * Binary search
 * - Array must be sorted
 * - Time complexities
     - Best time complexity => O(1)
     - Worst time complexity => O(log(n))
 */
public class _02Problem {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 6, 8, 10, 15, 18, 25};
        int target = 6;
        System.out.println(binarySearch(arr, target));
        target = 25;
        System.out.println(binarySearch(arr, target));
        target = 2;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (high + low) / 2;
        while (low <= high) {
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (high + low) / 2;
        }
        return -1;
    }
}
