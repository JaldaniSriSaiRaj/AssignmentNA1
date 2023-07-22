package ExercisesPlt;

import java.util.Scanner;

public class PyramidChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the character pyramid: ");
        int rows = scanner.nextInt();

        printCharacterPyramid(rows);
    }

    public static void printCharacterPyramid(int n) {
        char currentChar = 'A';

       
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

          
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }

           
            for (int j = 1; j < i; j++) {
                currentChar--;
                System.out.print(currentChar + " ");
            }

            System.out.println();
        }
    }
}
