package codewars.kyu7;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(ints -> ints[0] - ints[1])
                .sum();
    }
}
