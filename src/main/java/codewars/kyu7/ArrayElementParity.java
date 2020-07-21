package codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayElementParity {
    public static int solve(int[] arr) {
        List<Integer> list = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        List<Integer> collect = list.stream().map(Math::abs).collect(Collectors.toList());
        int result = 0;
        for (int i = 0; i < collect.size(); i++) {
            if (Collections.frequency(collect, collect.get(i)) == 1) {
                result = list.get(i);
            }
        }
        return result;
    }
}
