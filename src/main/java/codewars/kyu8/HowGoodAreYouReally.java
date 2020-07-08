package codewars.kyu8;

import java.util.stream.IntStream;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > IntStream.of(classPoints).sum() / classPoints.length;
    }
}
