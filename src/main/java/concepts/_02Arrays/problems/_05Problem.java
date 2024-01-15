package concepts._02Arrays.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Find multiple missing elements
 */
public class _05Problem {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 7, 8, 9, 11};
        System.out.println(findMissingElements(arr));

        System.out.println(findMissingElements2(arr));

        arr = new int[] {3, 4, 7, 8, 9, 11, 19};
        System.out.println(findMissingElements2(arr));

    }

    // 1st approach
    // Time complexity O(n^2)
    public static List<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if ( diff != 1) {
                for (int j = 1; j < diff; j++) {
                    elements.add(arr[i] + j);
                }
            }
        }
        return elements;
    }

    // 2nd approach
    // Time complexity => O(n)
    public static List<Integer> findMissingElements2(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int[] shadow = new int[arr[arr.length - 1] + 1];
        for (int i = 0; i < arr.length; i++) {
            shadow[arr[i]] = 1;
        }
        for (int i = arr[0]; i < shadow.length; i++) {
            if (shadow[i] != 1)
                result.add(i);
        }
        return result;
    }
}
