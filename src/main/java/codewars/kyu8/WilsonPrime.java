package codewars.kyu8;

import java.math.BigInteger;

public class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            return factorial(n - 1).add(BigInteger.ONE).mod(BigInteger.valueOf((long) (n * n))).equals(BigInteger.ZERO);
        }
    }

    public static BigInteger factorial(double n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
