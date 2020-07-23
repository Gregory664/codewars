package codewars.kyu7;

import java.util.Collections;

public class LunarCalculator {
    public static long add(long number1, long number2) {
        StringBuilder builder = new StringBuilder();
        String one = String.valueOf(number1);
        String two = String.valueOf(number2);
        int maxSize = Math.max(one.length(), two.length());
        one = normalizeLength(maxSize, one);
        two = normalizeLength(maxSize, two);
        for (int i = 0; i < one.length(); i++) {
            int num1 = Character.getNumericValue(one.charAt(i));
            int num2 = Character.getNumericValue(two.charAt(i));
            builder.append(Math.max(num1, num2));
        }
        return Long.parseLong(builder.toString());
    }

    public static String normalizeLength(int maxSize, String number) {
        return String.join("", Collections.nCopies(maxSize - number.length(), "0")) + number;
    }
}
