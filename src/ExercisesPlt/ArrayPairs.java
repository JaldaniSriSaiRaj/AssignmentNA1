package ExercisesPlt;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairs {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 3};
        int targetSum = 8;

        findPairsWithSum(arr, targetSum);
    }

    public static void findPairsWithSum(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + arr[i] + ", " + complement);
            }

            map.put(arr[i], i);
        }
    }
}

