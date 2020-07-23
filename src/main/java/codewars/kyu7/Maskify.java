package codewars.kyu7;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Maskify {
    public static String maskify(String str) {
        return str.length() > 4 ?
                IntStream.range(0, str.length() - 4)
                        .mapToObj(i -> "#")
                        .collect(Collectors.joining()) + str.substring(str.length() - 4) : str;

    }

    public static String maskify2(String str) {
        return str.length() > 4 ?
                String.join("", Collections.nCopies(str.length() - 4, "#")) + str.substring(str.length() - 4) :
                str;
    }
}
