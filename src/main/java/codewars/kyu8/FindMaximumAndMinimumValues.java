package codewars.kyu8;

import java.util.stream.IntStream;

public class FindMaximumAndMinimumValues {
    public int min(int[] list) {
        return IntStream.of(list).min().getAsInt();
    }

    public int max(int[] list) {
        return IntStream.of(list).max().getAsInt();
    }
}
