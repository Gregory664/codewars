package codewars.kyu7;

import java.math.BigInteger;
import java.util.Arrays;

public class LargeSum {
    public static String firstTenDigitsOfSum(String[] numbers) {
        BigInteger result = BigInteger.ZERO;
        BigInteger ost = BigInteger.ZERO;
        for (int i = numbers[0].length() - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += Character.getNumericValue(numbers[j].charAt(i));
            }
            long sumOst = sum % 10;
            result.add(BigInteger.valueOf(sumOst));
            result.add(ost);
            ost = BigInteger.valueOf(sum / 10);
        }
        return ost.toString().substring(0, 20);
        //TODO
        //Large sum
        //https://www.codewars.com/kata/5a378f28eced70bef80004b3
    }
}
