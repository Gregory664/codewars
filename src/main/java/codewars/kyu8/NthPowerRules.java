package codewars.kyu8;

import java.util.Arrays;

public class NthPowerRules {
    public static int modifiedSum(int[] array, int power) {
        int multiple = Arrays.stream(array).map(i -> (int) Math.pow(i, power)).sum();
        int sum = Arrays.stream(array).sum();
        return multiple - sum;
    }
}
