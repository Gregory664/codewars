package codewars.kyu8;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DnaStrand {
    public static String makeComplement(String dna) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "T");
        map.put("T", "A");
        map.put("G", "C");
        map.put("C", "G");
        return Arrays.stream(dna.split(""))
                .map(map::get)
                .collect(Collectors.joining());
    }
}
