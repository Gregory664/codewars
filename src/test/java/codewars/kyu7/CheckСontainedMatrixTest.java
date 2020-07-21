package codewars.kyu7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckСontainedMatrixTest {
    @Test
    public void basicTest() {

        int[][] mat1 = {
                { 4, 6, 7, 9 },
                { 0, 1, 6, 6 },
                { 2, 3, 5, 7 } };

        int[][] mat2 = {
                { 3, 7, 9 },
                { 1, 6, 6 },
                { 3, 5, 7 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);

        Assert.assertArrayEquals(new int[] { -1, -1 }, result);

    }

    @Test
    public void notContainedTest() {

        int[][] mat1 = { { 4, 6, 7 }, { 0, 1, 6 }, { 2, 3, 5 } };
        int[][] mat2 = { { 6, 7, 9 }, { 0, 1, 6 }, { 2, 3, 5 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);

        Assert.assertArrayEquals(new int[] { -1, -1 }, result);
    }

    @Test
    public void containedTest() {

        int[][] mat1 = { { 4, 6, 7 }, { 0, 1, 6 }, { 2, 3, 5 } };
        int[][] mat2 = { { 4, 6, 7 }, { 0, 1, 6 }, { 2, 3, 5 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);

        Assert.assertArrayEquals(new int[] { 0, 0 }, result);
    }

    @Test
    public void containedTest2() {

        int[][] mat1 = {
                { 4, 6, 7, 2, 3, 3 },
                { 3, 2, 1, 3, 1, 6 },
                { 1, 2, 4, 2, 3, 5 },
                { 1, 3, 5, 6, 1, 9 },
                { 2, 3, 5, 8, 9, 1 },
                { 1, 4, 6, 8, 0, 1 } };

        int[][] mat2 = {
                { 6, 1, 9 },
                { 8, 9, 1 },
                { 8, 0, 1 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);
        Assert.assertArrayEquals(new int[] { 3, 3 }, result);
    }

    @Test
    public void containedTest3() {

        int[][] mat1 = {
                { 4, 6, 7, 2, 3, 3 },
                { 3, 2, 1, 3, 1, 6 },
                { 1, 2, 4, 2, 3, 5 },
                { 1, 3, 5, 6, 1, 9 },
                { 2, 3, 5, 8, 9, 1 },
                { 1, 4, 6, 8, 0, 1 } };

        int[][] mat2 = {
                { 3, 1, 6 },
                { 2, 3, 5 },
                { 6, 1, 9 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);
        Assert.assertArrayEquals(new int[] { 1, 3 }, result);
    }

    @Test
    public void containedTest4() {

        int[][] mat1 = {
                { 4, 6, 7, 2, 3, 3 },
                { 3, 2, 1, 3, 1, 6 },
                { 1, 2, 4, 2, 3, 5 },
                { 1, 3, 5, 6, 1, 9 },
                { 2, 3, 5, 8, 9, 1 },
                { 1, 4, 6, 8, 0, 1 } };

        int[][] mat2 = {
                { 2, 4, 2 },
                { 3, 5, 6 },
                { 3, 5, 8 } };

        int[] result = CheckСontainedMatrix.checkIsContained(mat1, mat2);
        Assert.assertArrayEquals(new int[] { 2, 1 }, result);
    }
}