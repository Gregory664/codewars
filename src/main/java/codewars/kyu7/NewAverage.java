package codewars.kyu7;

import java.util.Arrays;

public class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        if (Arrays.stream(arr).average().orElse(0) > navg) {
            throw new IllegalArgumentException();
        }
        return (long) Math.ceil(navg * (arr.length + 1) - Arrays.stream(arr).sum());
    }
}
