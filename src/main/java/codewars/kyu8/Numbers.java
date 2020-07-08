package codewars.kyu8;

public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100D) / 100D;
    }

    public static double twoDecimalPlaces(double number) {
//        return Double.parseDouble(String.valueOf(number * 100D).split("\\.")[0]) / 100D;
        long x = (long) (number * 100);
        int z = (int) (number * 100);
        return (long) (number * 100) / 100.;
    }
}
