package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceSum {
    public static String showSequence(int value) {
        if (value == 0) {
            return "0=0";
        }
        if (value < 0) {
            return String.format("%d<0", value);
        }
        int sum = IntStream.rangeClosed(0, value).sum();
        String sequence = IntStream.rangeClosed(0, value).mapToObj(String::valueOf).collect(Collectors.joining("+"));
        return String.format("%s = %d", sequence, sum);
    }
}
