package codewars.kyu8;

import java.util.stream.IntStream;

public class ExtraPerfect {
    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number)
                .mapToObj(Integer::toBinaryString)
                .filter(s -> s.split("")[0].equals(s.split("")[s.length() - 1]))
                .mapToInt(s -> Integer.parseInt(s, 2))
                .toArray();
    }
}
