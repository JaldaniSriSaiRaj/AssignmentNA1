package ExercisesPlt;

import java.util.Scanner;

public class StringDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of parts to divide the string into: ");
        int n = scanner.nextInt();

        String[] dividedParts = divideString(input, n);

        System.out.println("Divided parts of the string:");
        for (String part : dividedParts) {
            System.out.println(part);
        }
    }

    public static String[] divideString(String str, int n) {
        int strLength = str.length();
        int partSize = strLength / n;
        String[] parts = new String[n];

        int startIndex = 0;
        int endIndex = partSize;

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
              
                parts[i] = str.substring(startIndex);
            } else {
                parts[i] = str.substring(startIndex, endIndex);
            }

            startIndex = endIndex;
            endIndex += partSize;
        }

        return parts;
    }
}
