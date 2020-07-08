package codewars.kyu8;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            builder.append(one.charAt(i));
            builder.append(two.charAt(i));
            builder.append(three.charAt(i));
        }
        return builder.toString();
    }
}
