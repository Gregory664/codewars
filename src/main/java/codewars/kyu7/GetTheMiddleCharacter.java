package codewars.kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ?
                String.valueOf(word.charAt(word.length() / 2 - 1)) +
                        word.charAt(word.length() / 2) :
                String.valueOf(word.charAt(word.length() / 2));
    }
}
