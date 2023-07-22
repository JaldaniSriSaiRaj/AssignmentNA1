package ExercisesPlt;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Even numbers in the array:");
        printEvenNumbers(arr);

        System.out.println("Odd numbers in the array:");
        printOddNumbers(arr);
    }

    public static void printEvenNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

