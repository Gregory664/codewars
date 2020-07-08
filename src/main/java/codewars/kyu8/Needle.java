package codewars.kyu8;

import java.util.Objects;

public class Needle {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (Objects.nonNull(haystack[i]) && haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }
}
