package codewars.kyu7;

import java.util.stream.IntStream;

public class ReturnTheFirstMmultiplesOfN {
    public static int[] multiples(int m, int n) {
            return IntStream.rangeClosed(1, n).map(i -> i * n).limit(m).toArray();
    }
}
