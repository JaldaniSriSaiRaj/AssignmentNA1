package ExercisesPlt;

import java.util.Scanner;

public class StarLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        printCustomPattern(rows);
    }

    public static void printCustomPattern(int n) {
       
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= (2 * n - 1) - 2 * (i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
