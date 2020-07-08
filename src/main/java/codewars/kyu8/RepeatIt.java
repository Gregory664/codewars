package codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat instanceof String ?
                IntStream.rangeClosed(1, n).mapToObj(i -> toRepeat.toString()).collect(Collectors.joining()) :
                "Not a string";
    }
}
