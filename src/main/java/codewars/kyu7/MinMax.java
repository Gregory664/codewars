package codewars.kyu7;

import java.util.stream.IntStream;

public class MinMax {
    public static int[] minMax(int[] arr) {

        return new int[] {
                IntStream.of(arr).min().getAsInt(),
                IntStream.of(arr).max().getAsInt()
        };
    }
}
