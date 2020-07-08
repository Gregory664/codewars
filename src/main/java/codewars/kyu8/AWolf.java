package codewars.kyu8;

import java.util.Arrays;
import java.util.List;

public class AWolf {
    public static String warnTheSheep(String[] array) {
        List<String> list = Arrays.asList(array);
        return list.indexOf("wolf") == array.length - 1 ?
                "Pls go away and stop eating my sheep" :
                String.format(
                        "Oi! Sheep number %d! You are about to be eaten by a wolf!",
                        (array.length - list.indexOf("wolf") - 1)
                );
    }
}
