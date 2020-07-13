package codewars.kyu7;

import java.util.Arrays;

public class SumDifferencesBetweenProductsAndLCMs {
    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        return (int) Arrays.stream(pairs)
                .mapToInt(pair -> (pair[0] * pair[1]) - lcm(pair[0], pair[1]))
                .sum();
    }

    public static int gcd(int one, int two) {
        while (one != 0 && two != 0) {
            if(one > two) {
                one = one % two;
            } else {
                two  = two % one;
            }
        }
        return one + two;
    }

    public static int lcm(int one, int two) {
        return two == 0 ? one : Math.abs(one * two) / gcd(one, two);
    }

}
