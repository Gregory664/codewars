package codewars.kyu7;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        if (lst.length == 0 || lst.length == 1) {
            return 0;
        }
        IntSummaryStatistics statistics = Arrays.stream(lst).boxed().collect(Collectors.summarizingInt(Integer::intValue));
        return statistics.getMax() - statistics.getMin();
    }
}
