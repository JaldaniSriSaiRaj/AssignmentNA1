package ExercisesPlt;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] leftRotatedArray = leftRotate(arr, 2);
        System.out.println("Left Rotated Array: " + Arrays.toString(leftRotatedArray));

        int[] rightRotatedArray = rightRotate(arr, 3);
        System.out.println("Right Rotated Array: " + Arrays.toString(rightRotatedArray));
    }

    public static int[] leftRotate(int[] arr, int rotations) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + rotations) % n;
            rotatedArray[i] = arr[newIndex];
        }

        return rotatedArray;
    }

    public static int[] rightRotate(int[] arr, int rotations) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i - rotations + n) % n;
            rotatedArray[i] = arr[newIndex];
        }

        return rotatedArray;
    }
}

