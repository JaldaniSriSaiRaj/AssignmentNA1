package ExercisesPlt;

import java.util.Scanner;

public class ContentOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the prefix string: ");
        String prefixString = scanner.nextLine();

        boolean startsWithContents = checkStartsWithContents(mainString, prefixString);

        if (startsWithContents) {
            System.out.println("The main string starts with the contents of the prefix string.");
        } else {
            System.out.println("The main string does NOT start with the contents of the prefix string.");
        }
    }

    public static boolean checkStartsWithContents(String mainString, String prefixString) {
        return mainString.startsWith(prefixString);
    }
}
