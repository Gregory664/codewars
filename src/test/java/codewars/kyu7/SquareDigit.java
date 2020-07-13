package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(("" + n).split(""))
                .mapToInt(Integer::parseInt)
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
    }
}
