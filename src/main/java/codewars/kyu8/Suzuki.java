package codewars.kyu8;

import java.util.Arrays;

public class Suzuki {
    public static long stairsIn20(int[][] stairs) {
        return Arrays.stream(stairs)
                .flatMapToInt(Arrays::stream)
                .sum() * 20L;
    }
}
