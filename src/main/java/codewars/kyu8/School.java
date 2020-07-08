package codewars.kyu8;

import java.util.stream.IntStream;

public class School {
    public static int getAverage(int[] marks) {
        return IntStream.of(marks).sum() / marks.length;
    }
}
