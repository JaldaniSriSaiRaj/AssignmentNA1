package ExercisesPlt;

import java.util.Scanner;

public class LengthOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = findStringLength(input);

        System.out.println("Length of the string: " + length);
    }

    public static int findStringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }
}
