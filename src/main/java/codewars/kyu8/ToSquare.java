package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? (int) Math.sqrt(i) : i * i)
                .toArray();

    }

    public static String printArray(Object[] array) {
        return Stream.of(array).map(String::valueOf).collect(Collectors.joining(","));
    }
}
