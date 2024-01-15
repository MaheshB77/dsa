package concepts._02Arrays.problems;

import java.util.*;

/**
 * Find duplicates in a sorted array
 * Time complexity - O(n)
 */
public class _06Problem {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 7, 7, 7, 9, 10, 10};
        System.out.println(getDuplicates(arr));
        System.out.println(getDuplicates2(arr));
    }

    // 1st Approach (Using HashMap)
    public static Set<Integer> getDuplicates(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : arr) {
            if (freq.get(num) > 1)
                result.add(num);
        }
        return result;
    }

    // 2nd Approach (Using auxiliary array)
    public static Set<Integer> getDuplicates2(int[] arr) {
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
