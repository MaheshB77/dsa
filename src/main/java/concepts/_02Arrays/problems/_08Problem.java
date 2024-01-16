package concepts._02Arrays.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two sum
 */
public class _08Problem {

    public static void main(String[] args) {
        int[] arr = new int[] {8, 4, 8, 5};
        int target = 16;
        System.out.println(Arrays.toString(twoSumElements(arr, target)));
        System.out.println(Arrays.toString(twoSumPositions(arr, target)));
    }

    public static int[] twoSumElements(int[] arr, int target) {
        int[] pair = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                pair[0]= arr[i];
                pair[1]= arr[map.get(diff)];
            }
        }
        return pair;
    }

    public static int[] twoSumPositions(int[] arr, int target) {
        int[] pair = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                pair[0]= i;
                pair[1]= map.get(diff);
                return pair;
            }
        }
        return pair;
    }
}
