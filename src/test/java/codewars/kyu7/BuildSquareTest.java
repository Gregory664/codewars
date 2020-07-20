package codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildSquareTest {
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuildSquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildSquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildSquare.generateShape(8));
    }
}