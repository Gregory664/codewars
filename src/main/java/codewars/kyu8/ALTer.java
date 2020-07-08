package codewars.kyu8;

import java.util.stream.Collectors;

public class ALTer {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i))
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .collect(Collectors.joining());

    }
}
