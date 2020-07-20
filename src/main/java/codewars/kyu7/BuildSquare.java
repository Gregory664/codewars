package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildSquare {
    public static final String generateShape(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> IntStream.rangeClosed(1, n).mapToObj(i1 -> "+").collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));
    }
}
