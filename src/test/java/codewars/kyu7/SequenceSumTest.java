package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceSumTest {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
    }

    @Test
    public void testBasic2() {
        assertEquals("0=0", SequenceSum.showSequence(0));
    }

    @Test
    public void testBasic3() {
        assertEquals("-5<0", SequenceSum.showSequence(-5));
    }
}