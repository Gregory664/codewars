package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values) {
        String result = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
        return Integer.parseInt(result);

    }
}
