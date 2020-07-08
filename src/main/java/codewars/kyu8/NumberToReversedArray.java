package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberToReversedArray {
    public static int[] digitize(long n) {
        int[] ints = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        return IntStream.rangeClosed(1, ints.length)
                .map(i -> ints[ints.length - i])
                .toArray();
    }
}
