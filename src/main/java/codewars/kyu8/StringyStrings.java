package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringyStrings {
    public static String stringy(int size) {
        return IntStream.rangeClosed(1, size)
                .map(i -> i % 2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}
