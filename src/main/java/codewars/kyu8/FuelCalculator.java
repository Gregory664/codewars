package codewars.kyu8;

public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLiter) {
        return litres * (pricePerLiter - Math.min(litres / 2 * 0.05, 0.25));
    }
}
