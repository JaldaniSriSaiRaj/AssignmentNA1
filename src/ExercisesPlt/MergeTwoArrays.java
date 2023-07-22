package ExercisesPlt;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int num : arr1) {
            mergedArray[index++] = num;
        }

        for (int num : arr2) {
            mergedArray[index++] = num;
        }

        return mergedArray;
    }
}

