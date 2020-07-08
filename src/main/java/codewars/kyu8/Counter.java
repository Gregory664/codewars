package codewars.kyu8;

import java.util.Objects;
import java.util.stream.Stream;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Stream.of(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(aBoolean -> aBoolean)
                .count();
    }
}
