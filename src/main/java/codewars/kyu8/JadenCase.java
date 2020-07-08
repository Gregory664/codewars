package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));

    }
}
