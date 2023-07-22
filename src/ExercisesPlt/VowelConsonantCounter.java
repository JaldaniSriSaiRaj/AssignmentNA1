package ExercisesPlt;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

  
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        countVowelsAndConsonants(str);
    }
}

