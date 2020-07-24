package codewars.kyu7;

import java.util.Arrays;
import static java.lang.Integer.bitCount;

public class SortByBinaryOnes {
    public static Integer[] sort2(Integer[] list) {
        return Arrays.stream(list)
                .map(Integer::toBinaryString)
                .sorted((s1, s2) -> {
                    int s1Length = s1.length() - s1.replaceAll("1", "").length();
                    int s2Length = s2.length() - s2.replaceAll("1", "").length();
                    int s1AsInt = Integer.parseInt(s1, 2);
                    int s2AsInt = Integer.parseInt(s2, 2);

                    return s1Length == s2Length ?
                            Integer.compare(s1AsInt, s2AsInt) :
                            Integer.compare(s2Length, s1Length);
                })
                .mapToInt(s -> Integer.parseInt(s, 2))
                .boxed()
                .toArray(Integer[]::new);
    }

    public static Integer[] sort(Integer[] list) {
        Arrays.sort(list, (a, b) -> bitCount(a) > bitCount(b) ? -1 : bitCount(a) < bitCount(b) ? 1 : a.compareTo(b));
        return list;
    }
}


