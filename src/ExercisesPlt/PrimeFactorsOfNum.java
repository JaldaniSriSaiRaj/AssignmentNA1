package ExercisesPlt;

import java.util.Scanner;

public class PrimeFactorsOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Prime factors of " + number + ": ");
        findPrimeFactors(number);
    }

    public static void findPrimeFactors(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

       
        if (number > 2) {
            System.out.print(number);
        }
        System.out.println();
    }
}

