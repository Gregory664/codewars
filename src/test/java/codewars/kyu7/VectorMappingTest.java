package codewars.kyu7;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorMappingTest {
    @Test
    public void someTest() {
        assertArrayEquals(new double[] {-108.21, -66.64},
                VectorMapping.mapVector(new double[] {5, 5},
                        new double[] {10, 20, 42},
                        new double[] {-100, -42, 69}), 1e-2);
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new double[] {46, 58},
                VectorMapping.mapVector(new double[] {46, 58},
                        new double[] {0, 0, 100},
                        new double[] {0, 0, 100}), 1e-2);

        assertArrayEquals(new double[] {125, 10},
                VectorMapping.mapVector(new double[] {50, 88},
                        new double[] {-25, 128, 100},
                        new double[] {50, 50, 100}), 1e-2);

        assertArrayEquals(new double[] {147.78, -87.0},
                VectorMapping.mapVector(new double[] {120, 58},
                        new double[] {100, 76, 36},
                        new double[] {120, -62, 50}), 1e-2);

        assertArrayEquals(new double[] {-107.14, -63.43},
                VectorMapping.mapVector(new double[] {5, 5},
                        new double[] {10, 20, 42},
                        new double[] {-100, -42, 60}), 1e-2);
    }
}