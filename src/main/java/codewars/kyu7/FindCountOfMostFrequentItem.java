package codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindCountOfMostFrequentItem {
    public static int mostFrequentItemCount(int[] collection) {
        List<Integer> list = Arrays.stream(collection).boxed().collect(Collectors.toList());
        return collection.length == 0 ? 0 :
                list.stream().map(i -> Collections.frequency(list, i)).max(Integer::compareTo).get();
    }
}
