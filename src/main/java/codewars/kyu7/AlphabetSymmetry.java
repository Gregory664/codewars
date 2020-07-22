package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlphabetSymmetry {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static int[] solve(String[] arr) {
        return Arrays.stream(arr)
                .map(String::toLowerCase)
                .map(AlphabetSymmetry::symmetry)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int symmetry(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == alphabet.length()) {
                break;
            }
            if (s.charAt(i) == alphabet.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static int[] solve2(String[] arr) {
        return Arrays.stream(arr)
                .map(String::toLowerCase)
                .mapToInt(AlphabetSymmetry::symmetry2)
                .toArray();
    }

    public static int symmetry2(String s) {
        return (int) IntStream.range(0, s.length())
                .filter(i -> alphabet.indexOf(s.charAt(i)) == i)
                .count();
    }
}
