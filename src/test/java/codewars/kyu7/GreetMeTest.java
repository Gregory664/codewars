package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetMeTest {
    @Test
    public void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}