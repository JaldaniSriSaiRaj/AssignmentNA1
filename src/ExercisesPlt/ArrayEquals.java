package ExercisesPlt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 1, 4, 2}; // Same elements as array1, but in a different order

        boolean areArraysEqual = checkArrayEquality(array1, array2);

        if (areArraysEqual) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays do NOT contain the same elements.");
        }
    }

    public static boolean checkArrayEquality(int[] array1, int[] array2) {
      
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }
}

