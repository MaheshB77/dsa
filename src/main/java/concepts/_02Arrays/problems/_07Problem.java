package concepts._02Arrays.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Find duplicates in an unsorted array
 */
public class _07Problem {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 7, 2, 7, 9, 3, 10, 3, 10};
        System.out.println(getDuplicates(arr));
    }

    public static Set<Integer> getDuplicates(int[] arr) {
        Set<Integer> result = new HashSet<>();
        int[] auxArr = new int[arr[arr.length - 1] + 1];
        for (int i = 0; i < arr.length; i++) {
            if (auxArr[arr[i]] != 1) {
                auxArr[arr[i]] = 1;
            } else {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
