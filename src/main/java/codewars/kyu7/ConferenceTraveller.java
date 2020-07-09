package codewars.kyu7;

import java.util.Arrays;
import java.util.List;

public class ConferenceTraveller {
    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        if(citiesVisited.length == 0) {
            return citiesOffered[0];
        }
        List<String> citiesOfferedList = Arrays.asList(citiesOffered);
        List<String> citiesVisitedList = Arrays.asList(citiesVisited);
        for (String s: citiesOfferedList) {
            if(!citiesVisitedList.contains(s)) {
                return s;
            }
        }

        return "No worthwhile conferences this year!";
    }

    static String conferencePicker2(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered)
                .filter(s -> !Arrays.asList(citiesVisited).contains(s))
                .findFirst()
                .orElse("No worthwhile conferences this year!");
    }
}
