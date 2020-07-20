package codewars.kyu7;

import java.util.Arrays;

public class SpecialNumber {
    public static String specialNumber(int number) {
        return Arrays.stream((String.valueOf(number)).split(""))
                .mapToInt(Integer::parseInt)
                .filter(i -> i <= 5)
                .count() == String.valueOf(number).length() ? "Special!!" : "NOT!!";
    }
}
