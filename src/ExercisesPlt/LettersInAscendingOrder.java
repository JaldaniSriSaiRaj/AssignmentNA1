package ExercisesPlt;

import java.util.Arrays;
import java.util.Scanner;

public class LettersInAscendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        name = name.toLowerCase();

        char[] letters = name.toCharArray();
        Arrays.sort(letters);
        String sortedName = new String(letters);

        System.out.println("Letters in ascending order: " + sortedName);
    }
}

