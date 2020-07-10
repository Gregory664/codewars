package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTheDigitTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests nbDig");
        testing(CountTheDigit.nbDig(25, 1), 11);
        testing(CountTheDigit.nbDig(5750, 0), 4700);
        testing(CountTheDigit.nbDig(11011, 2), 9481);
        testing(CountTheDigit.nbDig(12224, 8), 7733);
        testing(CountTheDigit.nbDig(11549, 1), 11905);
    }
}