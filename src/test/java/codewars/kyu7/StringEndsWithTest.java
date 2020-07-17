package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringEndsWithTest {
    @Test
    public void testSomething() {
        assertTrue(StringEndsWith.solution("abc", "bc"));
    }

    @Test
    public void testSomething2() {
        assertFalse(StringEndsWith.solution("abc", "d"));
    }

    @Test
    public void testSomething3() {
        assertFalse(StringEndsWith.solution("samurai", "ra"));
    }
}