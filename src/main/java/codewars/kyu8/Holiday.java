package codewars.kyu8;

public class Holiday {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) Math.floor(hol / (discount * 0.01 * normPrice));
    }
}
