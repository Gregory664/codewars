package codewars.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int[] array = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return String.format("%d %d", array[array.length - 1], array[0]);
    }

    public static String highAndLow2(String numbers) {
        IntSummaryStatistics collect = Arrays.stream(numbers.split(""))
                .collect(Collectors.summarizingInt(Integer::parseInt));
        return String.format("%d %d", collect.getMax(), collect.getMin());
    }
}
