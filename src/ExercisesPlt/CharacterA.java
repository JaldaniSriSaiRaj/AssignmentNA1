package ExercisesPlt;

import java.util.Scanner;

public class CharacterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int countA = countCharacterOccurrences(input, 'a');
        System.out.println("Number of times 'a' appears: " + countA);
    }

    public static int countCharacterOccurrences(String input, char character) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}
