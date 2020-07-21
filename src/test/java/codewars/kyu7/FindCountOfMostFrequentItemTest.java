package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindCountOfMostFrequentItemTest {
    @Test
    public void tests() {
        assertEquals(2, FindCountOfMostFrequentItem.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(5, FindCountOfMostFrequentItem.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }
}