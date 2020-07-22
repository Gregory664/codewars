package codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateCapitalization {
    public static String[] capitalize2(String s){
        String one = IntStream.range(0, s.length())
                .mapToObj(i -> i % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i)))
                .map(String::valueOf)
                .collect(Collectors.joining());

        String two = IntStream.range(0, s.length())
                .mapToObj(i -> i % 2 == 0 ? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i)))
                .map(String::valueOf)
                .collect(Collectors.joining());
        return new String[] {one, two};
    }

    public static String[] capitalize(String s){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                one.append(Character.toUpperCase(s.charAt(i)));
                two.append(Character.toLowerCase(s.charAt(i)));
            } else {
                one.append(Character.toLowerCase(s.charAt(i)));
                two.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return new String[] {one.toString(), two.toString()};
    }
}
