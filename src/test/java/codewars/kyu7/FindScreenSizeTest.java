package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindScreenSizeTest {
    @Test
    public void test2() {
        assertEquals("1694x1270", FindScreenSize.findScreenHeight(1694,"4:3"));
    }

    @Test
    public void test4By3() {
        assertEquals("1024x768", FindScreenSize.findScreenHeight(1024,"4:3"));
    }
    @Test
    public void test16By9() {
        assertEquals("1280x720", FindScreenSize.findScreenHeight(1280,"16:9"));
    }
    @Test
    public void test32By9() {
        assertEquals("3840x1080", FindScreenSize.findScreenHeight(3840,"32:9"));
    }
    @Test
    public void test() {
        assertEquals("2515x1886", FindScreenSize.findScreenHeight(2515,"4:3"));
    }
}