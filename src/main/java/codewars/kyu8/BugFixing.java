package codewars.kyu8;

public class BugFixing {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
