package ExercisesPlt;

import java.util.Scanner;

public class CharactersAtEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPresent = checkFirstTwoCharactersAtEnd(input);

        if (isPresent) {
            System.out.println("The first two characters are present at the end of the string.");
        } else {
            System.out.println("The first two characters are NOT present at the end of the string.");
        }
    }

    public static boolean checkFirstTwoCharactersAtEnd(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return false;
        }

        String lastTwoCharacters = str.substring(strLength - 2);
        String firstTwoCharacters = str.substring(0, 2);

        return lastTwoCharacters.equals(firstTwoCharacters);
    }
}

