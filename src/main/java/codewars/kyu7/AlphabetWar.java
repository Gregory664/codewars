package codewars.kyu7;

import java.util.HashMap;
import java.util.Map;

public class AlphabetWar {
    public static String alphabetWar(String fight){
        Map<Character, Integer> leftSide = new HashMap<>();
        leftSide.put('w', 4);
        leftSide.put('p', 3);
        leftSide.put('b', 2);
        leftSide.put('s', 1);

        Map<Character, Integer> rightSide = new HashMap<>();
        rightSide.put('m', 4);
        rightSide.put('q', 3);
        rightSide.put('d', 2);
        rightSide.put('z', 1);

        int left = 0;
        int right = 0;
        for (int i = 0; i < fight.length(); i++) {
            left += leftSide.getOrDefault(fight.charAt(i), 0);
            right += rightSide.getOrDefault(fight.charAt(i), 0);
        }
        return left > right ? "Left side wins!" : right > left ? "Right side wins!" : "Let's fight again!";
    }
}
