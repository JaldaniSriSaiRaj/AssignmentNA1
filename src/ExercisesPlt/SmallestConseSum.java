package ExercisesPlt;

public class SmallestConseSum {

    public static int findSmallestConsecutiveSum(int[] arr) {
        int currentSum = arr[0];
        int smallestSum = currentSum;

        for (int i = 1; i < arr.length; i++) {
           
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            smallestSum = Math.min(smallestSum, currentSum);
        }

        return smallestSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        int smallestSum = findSmallestConsecutiveSum(arr);
        System.out.println("The smallest sum of consecutive numbers is: " + smallestSum);
    }
}
