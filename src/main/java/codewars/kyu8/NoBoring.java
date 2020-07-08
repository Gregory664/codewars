package codewars.kyu8;

public class NoBoring {
    public static int noBoringZeros(int n) {
        return n == 0 ? 0 : Integer.parseInt(String.valueOf(n).replaceAll("0+$", ""));
    }
}
