package ExercisesPlt;

import java.util.Scanner;

public class RemoveSpaceInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(input);

        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        
        return str.replaceAll("\\s", "");
    }
}

