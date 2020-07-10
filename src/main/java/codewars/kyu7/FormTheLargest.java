package codewars.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FormTheLargest {
    public static long maxNumber(long n) {
        return Long.parseLong(String.valueOf(n).chars()
                .map(Character::getNumericValue)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

    public static long maxNumber2(long n) {
        return Long.parseLong(Arrays.stream(String.valueOf(n).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
