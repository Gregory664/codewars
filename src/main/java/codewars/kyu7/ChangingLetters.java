package codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangingLetters {
    public static String swap(String st){
        List<String> list = Arrays.asList("a", "e", "i", "o", "u");
        return Arrays.stream(st.split(""))
                .map(s -> list.contains(s) ? s.toUpperCase() : s)
                .collect(Collectors.joining());
    }
}
