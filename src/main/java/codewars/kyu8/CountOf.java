package codewars.kyu8;

import java.util.Objects;
import java.util.stream.IntStream;

public class CountOf {
    public static int[] countPositivesSumNegatives(int[] input) {
        return input.length == 0 ? new int[]{} :
                new int[]{
                        (int) IntStream.of(input).filter(Objects::nonNull).filter(i -> i > 0).count(),
                        IntStream.of(input).filter(Objects::nonNull).filter(i -> i < 0).sum()
                };
    }
}
