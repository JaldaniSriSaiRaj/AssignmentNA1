package ExercisesPlt;

import java.util.Scanner;

public class ClosedBlankTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the closed blank triangle: ");
        int rows = scanner.nextInt();

        printClosedBlankTriangle(rows);
    }

    public static void printClosedBlankTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = i - 1; j >= 1; j--) {
                if (j == 1 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

