package ExercisesPlt;

import java.util.Scanner;

public class GreatestPairFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] greatestPair = findGreatestPair(arr);
        System.out.println("Greatest Pair: " + greatestPair[0] + " and " + greatestPair[1]);
    }

    public static int[] findGreatestPair(int[] arr) {
        int[] greatestPair = new int[2];

        if (arr.length < 2) {
           
            return greatestPair;
        }

      
        int largest1 = Math.max(arr[0], arr[1]);
        int largest2 = Math.min(arr[0], arr[1]);

       
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest1) {
                largest2 = largest1;
                largest1 = arr[i];
            } else if (arr[i] > largest2) {
                largest2 = arr[i];
            }
        }

        greatestPair[0] = largest1;
        greatestPair[1] = largest2;

        return greatestPair;
    }
}
