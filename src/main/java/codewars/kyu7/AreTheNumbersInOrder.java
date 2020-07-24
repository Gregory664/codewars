package codewars.kyu7;

import java.util.Arrays;

public class AreTheNumbersInOrder {
    public static boolean isAscOrder(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return Arrays.equals(clone, arr);
    }
}
