package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDifferencesBetweenProductsAndLCMsTest {
    @Test
    public void BasicTests() {
        assertEquals(840, SumDifferencesBetweenProductsAndLCMs.sumDifferencesBetweenProductsAndLCMs(new int[][]{{15, 18}, {4, 5}, {12, 60}}));
        assertEquals(1092, SumDifferencesBetweenProductsAndLCMs.sumDifferencesBetweenProductsAndLCMs(new int[][]{{1, 1}, {0, 0}, {13, 91}}));
        assertEquals(0, SumDifferencesBetweenProductsAndLCMs.sumDifferencesBetweenProductsAndLCMs(new int[][]{{15, 7}, {4, 5}, {19, 60}}));
        assertEquals(1890, SumDifferencesBetweenProductsAndLCMs.sumDifferencesBetweenProductsAndLCMs(new int[][]{{20, 50}, {10, 10}, {50, 20}}));
        assertEquals(0, SumDifferencesBetweenProductsAndLCMs.sumDifferencesBetweenProductsAndLCMs(new int[][]{}));
    }

    @Test
    public void gcdTest() {
        assertEquals(21, SumDifferencesBetweenProductsAndLCMs.gcd(1071, 462));
    }

    @Test
    public void lcmTest() {
//        assertEquals(21, SumDifferencesBetweenProductsAndLCMs.lcm(1071, 462));
        assertEquals(216, SumDifferencesBetweenProductsAndLCMs.lcm(54, 24));
    }


}