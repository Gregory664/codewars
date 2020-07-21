package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetweenExtremesTest {
    @Test
    public void fixedTest() {
        assertEquals(42, BetweenExtremes.betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
        assertEquals(99, BetweenExtremes.betweenExtremes(new int[]{-1, -41, -77, -100}));
    }
}