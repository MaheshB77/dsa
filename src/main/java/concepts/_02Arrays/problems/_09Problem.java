package concepts._02Arrays.problems;

import java.util.Arrays;

/**
 * Two sum in a sorted array
 */
public class _09Problem {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 4, 8, 9};
        int target = 12;
        System.out.println(Arrays.toString(twoSumElements(arr, target)));
    }

    public static int[] twoSumElements(int[] arr, int target) {
        int[] pair = new int[2];
        for (int i = 0, j = arr.length - 1; j > i;) {
            if ((arr[i] + arr[j]) == target) {
                pair[0] = arr[i];
                pair[1] = arr[j];
                return pair;
            }
            else if ((arr[i] + arr[j]) < target) {
                i++;
            } else {
                j--;
            }
        }
        return pair;
    }
}
