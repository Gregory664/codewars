package codewars.kyu7;

import java.util.stream.IntStream;

public class SumOfTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
        return IntStream.rangeClosed(1, n).map(i -> (i + 1) * i / 2).sum();
    }
}
