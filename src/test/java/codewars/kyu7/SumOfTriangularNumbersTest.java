package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTriangularNumbersTest {
    @Test
    public void basicTests() {
        assertEquals(56, SumOfTriangularNumbers.sumTriangularNumbers(6));
        assertEquals(7140, SumOfTriangularNumbers.sumTriangularNumbers(34));
        assertEquals(0, SumOfTriangularNumbers.sumTriangularNumbers(-291));
        assertEquals(140205240, SumOfTriangularNumbers.sumTriangularNumbers(943));
        assertEquals(0, SumOfTriangularNumbers.sumTriangularNumbers(-971));
    }
}