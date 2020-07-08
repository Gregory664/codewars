package codewars.kyu8;

import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static List<String> sort(List<String> textbooks) {

        return textbooks.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
    }
}
