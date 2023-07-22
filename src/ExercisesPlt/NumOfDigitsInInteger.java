package ExercisesPlt;

public class NumOfDigitsInInteger {
    public static void main(String[] args) {
        int number = 1234567;
        int digitsCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitsCount);
    }

    public static int countDigits(int number) {
        
        return String.valueOf(number).length();
    }
}

