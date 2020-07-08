package codewars.kyu8;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        try {
            return (int) Math.pow(array[n], n);
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }
}
