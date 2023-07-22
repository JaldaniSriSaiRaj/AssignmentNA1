package ExercisesPlt;

import java.util.Scanner;

public class StringReverse {
    public static boolean stringRev(String str1, String str2) {
    
        if (str1.length() != str2.length()) {
            return false;
        }

        

        for (int i = 0; i <str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str1.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter string1");
        String str1 = sc.nextLine();
        System.out.println("Enter string2");
        String str2 = sc.nextLine();
        if (stringRev(str1, str2)) {
            System.out.println("yes strings are reverse of each other.");
        } else {
            System.out.println("strings are not reverse of each other.");
        }
    }
}





