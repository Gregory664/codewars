package codewars.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
