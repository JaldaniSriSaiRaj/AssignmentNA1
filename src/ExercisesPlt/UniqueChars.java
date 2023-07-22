package ExercisesPlt;

import java.util.HashSet;
import java.util.Set;

public class UniqueChars {

    public static String findUniqueCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (uniqueChars.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        String uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters in the string: " + uniqueChars);
    }
}

