package codewars.kyu8;

public class TipCalculator {


    public static Integer calculateTip(double amount, String rating) {
        try {
            return rating.equalsIgnoreCase("Terrible") ? (int) amount :
                    rating.equalsIgnoreCase("Poor") ? (int) Math.ceil(amount * 0.05) :
                            rating.equalsIgnoreCase("Good") ? (int) Math.ceil(amount * 0.1) :
                                    rating.equalsIgnoreCase("Great") ? (int) Math.ceil(amount * 0.15) :
                                            rating.equalsIgnoreCase("Excellent") ? (int) Math.ceil(amount * 0.20) : null;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
