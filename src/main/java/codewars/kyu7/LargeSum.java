package codewars.kyu7;

import java.math.BigInteger;
import java.util.Arrays;

public class LargeSum {
    public static String firstTenDigitsOfSum2(String[] numbers) {
        long ost = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = numbers[0].length() - 1; i >= 0; i--) {
            long sum = 0;
            for (String number : numbers) {
                sum += Character.getNumericValue(number.charAt(i));
            }
            builder.append((sum + ost) % 10);
            ost = (sum + ost) / 10;
        }
        builder.append(new StringBuilder(String.valueOf(ost)).reverse().toString());
        return builder.reverse().toString().substring(0, 10);
    }

    public static String firstTenDigitsOfSum3(String[] numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (String number : numbers) {
            sum = sum.add(new BigInteger(number));
        }
        return sum.toString().substring(0, 10);
    }

    public static String firstTenDigitsOfSum(String[] numbers) {
        return Arrays.stream(numbers)
                .map(BigInteger::new)
                .reduce(BigInteger::add)
                .get()
                .toString()
                .substring(0, 10);
    }
}
