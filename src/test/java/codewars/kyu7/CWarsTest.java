package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CWarsTest {
    @Test
    public void testExamples() {
        assertEquals("C.Wars", CWars.initials("code wars"));
        assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
        assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
    }
}