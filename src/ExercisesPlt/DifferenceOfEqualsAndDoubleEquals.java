package ExercisesPlt;

public class DifferenceOfEqualsAndDoubleEquals {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = str1;

       
        System.out.println("equals method:");
        System.out.println(str1.equals(str2)); 
        System.out.println(str1.equals(str3)); 
       
        System.out.println("== operator:");
        System.out.println(str1 == str2); 
        System.out.println(str1 == str3); 
    }
}

