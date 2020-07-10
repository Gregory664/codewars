package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.LongStream;

public class BalancedNumber {
    public static String balancedNum(long number) {
        long[] longs = Arrays.stream(String.valueOf(number).split("")).mapToLong(Long::parseLong).toArray();
        if (longs.length <= 2) {
            return "Balanced";
        }
        long leftSum = longs.length % 2 == 0 ?
                LongStream.of(longs).limit(longs.length / 2 - 1).sum() :
                LongStream.of(longs).limit(longs.length / 2).sum();
        long rightSum = LongStream.of(longs).skip(longs.length / 2 + 1).sum();
        return leftSum == rightSum ? "Balanced" : "Not Balanced";
    }
}
