package ExercisesPlt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printDuplicateCharacters(input);
    }

    public static void printDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " occurrences");
            }
        }
    }
}

