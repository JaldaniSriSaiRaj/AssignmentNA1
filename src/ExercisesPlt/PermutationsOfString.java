package ExercisesPlt;

public class PermutationsOfString {

    public static void printPermutations(String str) {
        printPermutationsHelper("", str);
    }

    private static void printPermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();

        
        if (n == 0) {
            System.out.println(prefix);
        } else {
            
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                printPermutationsHelper(newPrefix, newRemaining);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All permutations of the string " + input + ":");
        printPermutations(input);
    }
}
