package ExercisesPlt;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();

        printDiamond(rows);
    }

    public static void printDiamond(int n) {
        int spaces = n - 1;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = n * 2 - 3;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}

