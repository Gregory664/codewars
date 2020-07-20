package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCTest {
    @Test
    public void testSomething() {
        assertEquals(4, CC.charCount("fizzbuzz", 'z'));
        assertEquals(4, CC.charCount("FIZZBUZZ", 'z'));
    }
}