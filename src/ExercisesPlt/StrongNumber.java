package ExercisesPlt;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to check for strong numbers: ");
        int maxNumber = scanner.nextInt();

        System.out.println("Strong numbers between 1 and " + maxNumber + ":");
        findStrongNumbers(maxNumber);
    }

    public static void findStrongNumbers(int maxNumber) {
        for (int number = 1; number <= maxNumber; number++) {
            if (isStrongNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
