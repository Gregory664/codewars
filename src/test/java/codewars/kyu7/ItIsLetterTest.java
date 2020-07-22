package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItIsLetterTest {
    @Test
    public void fixedTests() {
        assertFalse(ItIsLetter.isLetter(""));
        assertTrue(ItIsLetter.isLetter("a"));
        assertTrue(ItIsLetter.isLetter("X"));
        assertFalse(ItIsLetter.isLetter("7"));
        assertFalse(ItIsLetter.isLetter("*"));
        assertFalse(ItIsLetter.isLetter("ab"));
        assertFalse(ItIsLetter.isLetter("a\n"));
    }
}