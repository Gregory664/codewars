package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Histogram {
    public static String histogram(final int results[]) {
        StringBuilder builder = new StringBuilder();
        for (int i = results.length - 1; i >= 0; i--) {
            if(results[i] == 0) {
                builder.append(i + 1).append("|").append("\n");
            } else {
                String delimiter = IntStream.rangeClosed(1, results[i])
                        .mapToObj(i1 -> "#")
                        .collect(Collectors.joining());
                String result = String.format("%d|%s %d", i + 1, delimiter, results[i]);
                builder.append(result).append("\n");
            }
        }
        return builder.toString();
    }
}
