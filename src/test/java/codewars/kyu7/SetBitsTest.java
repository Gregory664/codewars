package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetBitsTest {
    SetBits sb = new SetBits();
    @Test
    public void sampleTests() {
        assertEquals(sb.eliminateUnsetBits("11010101010101"), 255);
        assertEquals(sb.eliminateUnsetBits("111"), 7);
        assertEquals(sb.eliminateUnsetBits("1000000"), 1);
    }
}