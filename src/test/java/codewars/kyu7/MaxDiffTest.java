package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDiffTest {
    @Test
    public void BasicTests() {
        assertEquals("only positives", 4, MaxDiff.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, MaxDiff.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, MaxDiff.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, MaxDiff.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, MaxDiff.maxDiff(new int[]{}));
    }
}