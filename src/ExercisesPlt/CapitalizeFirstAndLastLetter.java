package ExercisesPlt;

import java.util.Scanner;

public class CapitalizeFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String modifiedString = capitalizeFirstLastCharacters(input);

        System.out.println("Modified sentence: " + modifiedString);
    }

    public static String capitalizeFirstLastCharacters(String sentence) {
        StringBuilder result = new StringBuilder();

       
        String[] words = sentence.split(" ");

       
        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            } else {
               
                char firstChar = Character.toUpperCase(word.charAt(0));
                result.append(firstChar).append(firstChar).append(" ");
            }
        }

        
        return result.toString().trim();
    }
}

