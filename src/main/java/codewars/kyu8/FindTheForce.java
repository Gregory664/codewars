package codewars.kyu8;

public class FindTheForce {

    public static double solution(double[] arrVal, String[] arrUnit) {
        return massConverter(arrVal[0], arrUnit[0]) * massConverter(arrVal[1], arrUnit[1]) / Math.pow(distanceConverter(arrVal[2], arrUnit[2]), 2) * (6.67 * 1.0E-11);
    }

    public static double distanceConverter(double value, String unit) {
        switch (unit) {
            case "ft":
                return value * 0.3048;
            case "μm":
                return value * 1.0E-6;
            case "mm":
                return value * 1.0E-3;
            case "cm":
                return value * 1.0E-2;
            default:
                return value;
        }
    }

    public static double massConverter(double value, String unit) {
        switch (unit) {
            case "lb":
                return value * 0.453592;
            case "μg":
                return value * 1.0E-9;
            case "mg":
                return value * 1.0E-6;
            case "g":
                return value * 1.0E-3;
            default:
                return value;
        }
    }
}
