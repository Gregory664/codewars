package codewars.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.split(" "))
                .map(MorseCode::get)
                .map(s -> s == null ? " " : s)
                .collect(Collectors.joining("")).replaceAll("\\s+", " ");

    }

    public static void main(String[] args) {
        MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .");
    }

    public static class MorseCode {
        public static String get(String value) {
            return value;
        }
    }
}
