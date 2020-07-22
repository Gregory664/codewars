package codewars.kyu7;

import java.math.RoundingMode;

public class FindScreenSize {
    public static String findScreenHeight(int width, String ratio) {
        int x = Integer.parseInt(ratio.split(":")[0]);
        int y = Integer.parseInt(ratio.split(":")[1]);
        return String.format("%dx%d", width, (int) Math.floor(width * 1D / x * y));
    }
}
