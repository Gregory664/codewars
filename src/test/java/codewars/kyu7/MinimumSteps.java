package codewars.kyu7;

import java.util.Arrays;

public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int count = 0;
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(sum >= k) {
                break;
            }
            sum += numbers[i];
            count++;
        }
        return count;
    }
}
