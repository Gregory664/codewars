package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CovfefeTest {
    @Test
    public void basicTest() {
        assertEquals("covfefe", Covfefe.covfefe("coverage"));
        assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
        assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
        assertEquals( "double space  covfefe" ,Covfefe.covfefe("double space "));
        assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
    }
}