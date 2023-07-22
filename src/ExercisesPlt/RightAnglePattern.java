package ExercisesPlt;

import java.util.Scanner;

public class RightAnglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the right-angle triangle: ");
        int rows = scanner.nextInt();

        displayRightAngleTriangle(rows);
    }

    public static void displayRightAngleTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
