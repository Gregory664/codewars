package codewars.kyu8;

import java.util.stream.IntStream;

public class Sequence {
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(-n, -1).map(i -> -i).toArray();
    }
}
