package codewars.kyu8;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (blueStart - bluePulled) / (1D * blueStart + redStart - bluePulled - redPulled);
    }
}
