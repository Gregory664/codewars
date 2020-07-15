package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {
    public static String accum(String s) {
        return IntStream.rangeClosed(1, s.length())
                .mapToObj(i -> replicateString(s.charAt(i - 1), i))
                .collect(Collectors.joining("-"));
    }

    public static String replicateString(char c, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                builder.append(Character.toUpperCase(c));
            } else {
                builder.append(Character.toLowerCase(c));
            }
        }
        return builder.toString();
    }
}
