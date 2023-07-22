package ExercisesPlt;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to check for perfect numbers: ");
        int maxNumber = scanner.nextInt();

        System.out.println("Perfect numbers between 1 and " + maxNumber + ":");
        findPerfectNumbers(maxNumber);
    }

    public static void findPerfectNumbers(int maxNumber) {
        for (int number = 1; number <= maxNumber; number++) {
            if (isPerfectNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }
}

