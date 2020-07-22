package codewars.kyu7;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        String pattern = String.format("(?<=\\G.{%d})", partLength);
        return String.join(" ", s.split(pattern));
    }
}
