package codewars.kyu8;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n) {
        int minSqrt = (int) Math.pow((int) Math.sqrt(n), 2);
        int maxSqrt = (int) Math.pow((int) Math.sqrt(n) + 1, 2);
        return n - minSqrt < maxSqrt - n ? minSqrt : maxSqrt;
    }
}
