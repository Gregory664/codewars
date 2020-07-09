package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumGapTest {
    @Test
    public void Check_Positive_Values()
    {
        assertEquals(  4, MaximumGap.maxGap(new int[]{13,10,2,9,5}));
        assertEquals(  8, MaximumGap.maxGap(new int[]{13,3,5}));
        assertEquals(168, MaximumGap.maxGap(new int[]{24,299,131,14,26,25}));
    }
    @Test
    public void Check_Negative_Values()
    {
        assertEquals( 23, MaximumGap.maxGap(new int[]{-3,-27,-4,-2}));
        assertEquals(767, MaximumGap.maxGap(new int[]{-7,-42,-809,-14,-12}));
    }
    @Test
    public void Check_Mixed_Values()
    {
        assertEquals(278, MaximumGap.maxGap(new int[]{12,-5,-7,0,290}));
        assertEquals(576, MaximumGap.maxGap(new int[]{-54,37,0,64,-15,640,0}));
    }
}