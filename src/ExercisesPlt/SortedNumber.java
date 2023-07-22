package ExercisesPlt;

import java.util.Arrays;
import java.util.Scanner;

public class SortedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        String numberString = Long.toString(number);
        char[] digits = numberString.toCharArray();
        Arrays.sort(digits);
        String sortedNumber = new String(digits);

        System.out.println("Digits in ascending order: " + sortedNumber);
    }
}

