package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthSeriesTest {
    @Test
    public void test1() {
        assertEquals("1.57", NthSeries.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", NthSeries.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", NthSeries.seriesSum(15));
    }

    @Test
    public void test4() {
        assertEquals("0.00", NthSeries.seriesSum(0));
    }

    @Test
    public void test5() {
        assertEquals("2.40", NthSeries.seriesSum(59));
    }
}