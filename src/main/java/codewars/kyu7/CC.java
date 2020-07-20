package codewars.kyu7;

public class CC {
    public static int charCount(String str, char c) {
        return (int) str.chars().filter(i -> Character.toLowerCase(i) == Character.toLowerCase(c)).count();
    }
}
