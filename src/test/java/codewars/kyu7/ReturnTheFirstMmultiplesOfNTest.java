package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnTheFirstMmultiplesOfNTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {5, 10, 15}, ReturnTheFirstMmultiplesOfN.multiples(3, 5));
    }
}