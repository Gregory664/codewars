package codewars.kyu7;

import java.util.stream.IntStream;

public class DoNotGiveMeFive {
       public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end)
                .mapToObj(String::valueOf)
                .filter(s -> !s.contains("5"))
                .count();
    }
}
