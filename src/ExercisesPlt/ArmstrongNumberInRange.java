package ExercisesPlt;

import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        findArmstrongNumbersInRange(start, end);
    }

    public static void findArmstrongNumbersInRange(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = countDigits(number);

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
