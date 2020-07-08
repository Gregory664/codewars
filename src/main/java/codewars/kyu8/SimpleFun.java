package codewars.kyu8;

public class SimpleFun {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nRows - row) * (nCols - col + 1);
    }
}
