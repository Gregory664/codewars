package codewars.kyu7;

import java.util.Arrays;

public class ArraySumminator {
    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        return Arrays.stream(numbersWithBases).mapToLong(b -> Integer.parseInt(b.number, b.base)).sum();
    }
}

class BasedNumbers{
    String number;
    int base;

    public BasedNumbers(String number, int base) {
        this.number = number;
        this.base = base;
    }
}

