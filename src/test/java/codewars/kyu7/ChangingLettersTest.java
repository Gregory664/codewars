package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChangingLettersTest {
    @Test
    public void swap_1() {
        assertEquals("HEllOWOrld!",ChangingLetters.swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy",ChangingLetters.swap("Sunday"));
    }

}