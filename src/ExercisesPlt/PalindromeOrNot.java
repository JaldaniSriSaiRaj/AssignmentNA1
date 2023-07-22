package ExercisesPlt;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str1="Madam";
		String str2="";
		char ch;
		for(int i=0;i<=str1.length()-1;i++) {
			
			ch=str1.charAt(i);
			str2=ch+str2;
			
		}
		if(str2.equalsIgnoreCase(str1)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}