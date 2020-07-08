package codewars.kyu8;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {


    public static String rps(String p1, String p2) {
        Map<String, String> map = new HashMap<>();
        map.put("paper-paper", "Draw!");
        map.put("paper-scissors", "Player 2 won!");
        map.put("paper-rock", "Player 1 won!");
        map.put("rock-rock", "Draw!");
        map.put("rock-paper", "Player 2 won!");
        map.put("rock-scissors", "Player 1 won!");
        map.put("scissors-scissors", "Draw!");
        map.put("scissors-rock", "Player 2 won!");
        map.put("scissors-paper", "Player 1 won!");
        return map.get(p1 + "-" + p2);
    }
}
