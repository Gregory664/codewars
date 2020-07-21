package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pattern {
    public static String pattern(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> IntStream.rangeClosed(i, n).mapToObj(String::valueOf).collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));
    }
}
