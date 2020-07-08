package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return Arrays.stream(numberString.split(""))
                .map(s -> Integer.parseInt(s) < 5 ? "0" : "1")
                .collect(Collectors.joining());
    }
}
