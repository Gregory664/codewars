package codewars.kyu7;

import java.util.stream.IntStream;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .filter(i -> Character.getNumericValue(i) == d)
                .count();
    }
}
