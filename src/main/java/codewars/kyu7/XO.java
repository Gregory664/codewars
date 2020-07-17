package codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XO {
//    public static boolean getXO2(String str) {
//        List<String> list = Arrays.asList(str.split(""));
//        return Collections.frequency(list,"x") == Collections.frequency(list, "o");
//    }

    public static boolean getXO(String str) {
        int x = (int) str.chars()
                .filter(i -> Character.toLowerCase(i) == 'x')
                .count();
        int o = (int) str.chars()
                .filter(i -> Character.toLowerCase(i) == 'o')
                .count();
        return x == o;
    }
}
