package codewars.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLeaders {
    public static List arrayLeaders(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Arrays.stream(numbers).skip(i + 1).sum()) {
                list.add(numbers[i]);
            }
        }
        return list;
    }
}
