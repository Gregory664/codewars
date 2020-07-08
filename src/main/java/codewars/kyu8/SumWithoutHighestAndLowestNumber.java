package codewars.kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        return numbers == null || numbers.length == 0 ? 0 :
                Arrays.stream(numbers)
                        .sorted()
                        .limit(numbers.length - 1)
                        .skip(1)
                        .sum();
    }
}
