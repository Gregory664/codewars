package codewars.kyu7;

import java.util.Arrays;
import java.util.List;

public class CWars {
    public static String initials(String name){
        StringBuilder builder = new StringBuilder();
        List<String> list = Arrays.asList(name.split(" "));
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            if(i == list.size() - 1) {
                builder.append(Character.toUpperCase(tmp.charAt(0))).append(tmp.substring(1));
            } else {
                builder.append(Character.toUpperCase(tmp.charAt(0))).append(".");
            }
        }
        return builder.toString();
    }
}
