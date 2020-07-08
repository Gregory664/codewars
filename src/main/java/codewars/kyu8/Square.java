package codewars.kyu8;

public class Square {
    public static long solve2(int n) {
        for (long i = 1; i < n * n; i++) {
            String iSqrt = String.valueOf(Math.sqrt(i));
            if (iSqrt.charAt(iSqrt.length() - 1) == '0') {
                String value = String.valueOf(Math.sqrt(i + n));
                if (value.charAt(value.length() - 1) == '0') {
                    return i;
                }
            }
        }
        return -1;
    }

}
