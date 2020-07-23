package codewars.kyu7;

import java.util.Arrays;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int max = 0;
        for (String s : a1) {
            for (String value : a2) {
                max = Math.max(Math.abs(s.length() - value.length()), max);
            }
        }
        return max;
    }

    public static int mxdiflg2(String[] a1, String[] a2) {
        return a1.length == 0 || a2.length == 0 ? -1 :
                Math.max(
                        Arrays.stream(a1).mapToInt(String::length).max().getAsInt() - Arrays.stream(a2).mapToInt(String::length).min().getAsInt(),
                        Arrays.stream(a2).mapToInt(String::length).max().getAsInt() - Arrays.stream(a1).mapToInt(String::length).min().getAsInt()
                );
    }
}
