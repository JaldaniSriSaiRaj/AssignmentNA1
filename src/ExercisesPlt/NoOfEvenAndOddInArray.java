package ExercisesPlt;

import java.util.Scanner;

public class NoOfEvenAndOddInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int evenCount = countEvenElements(arr);
        int oddCount = countOddElements(arr);

        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }

    public static int countEvenElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}

