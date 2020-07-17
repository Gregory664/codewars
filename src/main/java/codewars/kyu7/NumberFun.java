package codewars.kyu7;

public class NumberFun {
    public static long findNextSquare2(long sq) {
        String s = String.valueOf(Math.sqrt(sq));
        return s.charAt(s.length() - 1) != '0' ? -1 : (long) Math.pow(Math.sqrt(sq) + 1, 2);
    }

    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }

}
