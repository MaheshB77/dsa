package concepts._02Arrays.problems;

/**
 * Find Min and Max in a single run
 */
public class _10Problem {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 1, 9};
        findMixMax(arr);
    }

    public static void findMixMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("MIN = " + min + ", MAX = " + max);
    }
}
