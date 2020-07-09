package codewars.kyu7;

import java.util.OptionalLong;
import java.util.stream.IntStream;

public class ProductArray5 {
    public static long[] productArray2(int[] numbers) {
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long temp = 1;
            for (int j = 0; j < numbers.length; j++) {
                if(j != i) {
                    temp *= numbers[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }

    public static long[] productArray(int[] numbers) {
        long p = IntStream.of(numbers).asLongStream().reduce(1, (x, y) -> x * y);
        return IntStream.of(numbers).mapToLong(i -> p / i).toArray();
    }
}
