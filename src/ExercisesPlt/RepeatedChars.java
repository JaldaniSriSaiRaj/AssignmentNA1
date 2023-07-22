package ExercisesPlt;

public class RepeatedChars {

    public static void printRepeatedCharacters(String input) {
        
        input = input.toLowerCase();

        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isRepeated = false;

            
            for (int j = i + 1; j < input.length(); j++) {
                char nextChar = input.charAt(j);

               
                if (currentChar == nextChar) {
                    if (!isRepeated) {
                        System.out.print("Repeated character(s): " + currentChar + " ");
                        isRepeated = true;
                    }
                    System.out.print(nextChar + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "programming";
        printRepeatedCharacters(input);
    }
}
