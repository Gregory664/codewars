package codewars.kyu7;

import java.util.stream.IntStream;

public class Sequence {
    public static int nthterm2(int first, int n, int c) {
        int[] ints = IntStream.iterate(first, i -> i + c).limit(++n).toArray();
        return ints[ints.length - 1];
    }

    public static int nthterm(int first, int n, int c) {
        return first + (n * c);
    }
}
