public class VowelProgram {
    /**
     * creating method with passing character argument and check the condition
     * whether the character is vowel character or not  if yes prints is vowel otherwise prints constant
     */

    static void isVowel(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U') {
            System.out.println("It is a Vowel.");
        } else {
            System.out.println("It is a Consonant.");
        }
    }

    static public void main(String[] args) {
        //passing character as an argument in to the method
        isVowel('E');
        isVowel('I');

    }
}
