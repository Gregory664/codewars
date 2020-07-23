package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoNotGiveMeFiveTest {
    @Test
    public void exampleTests() {
        assertEquals(8, DoNotGiveMeFive.dontGiveMeFive(1,9));
        assertEquals(12, DoNotGiveMeFive.dontGiveMeFive(4,17));
        assertEquals(9, DoNotGiveMeFive.dontGiveMeFive(-5,5));
    }
}