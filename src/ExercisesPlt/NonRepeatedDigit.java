package ExercisesPlt;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printNonRepeatedDigits(arr);
    }

    public static void printNonRepeatedDigits(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

       
        for (int num : arr) {
            int digit = Math.abs(num);
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

       
        System.out.print("Non-repeated digits in the array: ");
        for (int num : arr) {
            int digit = Math.abs(num); 
            if (frequencyMap.get(digit) == 1) {
                System.out.print(digit + " ");
                frequencyMap.put(digit, -1); 
            }
        }
    }
}

