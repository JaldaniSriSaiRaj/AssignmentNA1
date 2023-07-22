package ExercisesPlt;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Integers ");
        String input = scanner.nextLine();
        
        String[] numbers = input.split(" ");
        
        int sumEven = 0;
        int sumOdd = 0;
        
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);
    }
}

