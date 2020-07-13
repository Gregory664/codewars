package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircularListTest {
    @Test
    public void nextTest() throws Exception {
        final CircularList<String> xs = new CircularList<>("one", "two", "three");
        assertEquals("one", xs.next());
        assertEquals("two", xs.next());
        assertEquals("three", xs.next());
        assertEquals("one", xs.next());
        assertEquals("two", xs.next());
        assertEquals("three", xs.next());
    }

    @Test
    public void prevTest() throws Exception {
        final CircularList<Integer> ys = new CircularList<>(1, 2, 3, 4, 5);
        assertEquals(java.util.Optional.of(5).get(), ys.prev());
        assertEquals(java.util.Optional.of(4).get(), ys.prev());
        assertEquals(java.util.Optional.of(3).get(), ys.prev());
        assertEquals(java.util.Optional.of(2).get(), ys.prev());
        assertEquals(java.util.Optional.of(1).get(), ys.prev());
        assertEquals(java.util.Optional.of(5).get(), ys.prev());
    }
}