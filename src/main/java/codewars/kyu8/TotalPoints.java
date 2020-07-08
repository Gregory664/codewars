package codewars.kyu8;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {

        return Arrays.stream(games)
                .mapToInt(TotalPoints::getPoints)
                .sum();
    }

    public static int getPoints(String s) {
        int x = Integer.parseInt(s.split(":")[0]);
        int y = Integer.parseInt(s.split(":")[1]);
        return x > y ? 3 : x < y ? 0 : 1;
    }
}
