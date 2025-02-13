public class Demo083 {
    public static void main(String[] args) {
        String str = "indhu"; 

        if (str.isEmpty()) {
            System.out.println("The string is empty.");
            return;
        }

        char firstChar = str.charAt(0);
        if (isVowel(firstChar)) {
            System.out.println("The first character '" + firstChar + "' is a vowel.");
        } else {
            System.out.println("The first character '" + firstChar + "' is a consonant.");
        }
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}