package codewars.kyu8;

public class Surface {
    public static int[] getSize(int w, int h, int d) {
        return new int[]{
                2 * w * h + 2 * w * d + 2 * h * d,
                w * h * d
        };
    }
}
