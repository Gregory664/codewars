package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceTravellerTest {
    @Test
    public void noCitiesVisited() {
        assertEquals("Stockholm", ConferenceTraveller.conferencePicker(
                new String[] {},
                new String[] {"Stockholm","Paris","Melbourne"}));
    }

    @Test
    public void noNewCities() {
        assertEquals("No worthwhile conferences this year!", ConferenceTraveller.conferencePicker(
                new String[] {"London","Mexico City","Melbourne","Buenos Aires","Berlin","Hong Kong"},
                new String[] {"Berlin","Melbourne"}));
    }
}