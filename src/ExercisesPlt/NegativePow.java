package ExercisesPlt;

public class NegativePow {

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / (base * power(base, -(exponent + 1)));
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        double base = 2.5;
        int exponent = -3;

        double result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}
