package ExercisesPlt;

public class CharacterFreq {

    public static int countCharacterFrequency(String str, char targetChar) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "capgemini";
        char targetChar = 'i';
        int frequency = countCharacterFrequency(str, targetChar);
        System.out.println("The character '" + targetChar + "' is repeated " + frequency + " times in the string.");
    }
}
