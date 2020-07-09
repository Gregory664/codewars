package codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;

public class MaximumGap {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int maxGap = 0;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] - numbers[i - 1] > maxGap) {
                maxGap = numbers[i] - numbers[i - 1];
            }
        }
        return maxGap;
    }
}
