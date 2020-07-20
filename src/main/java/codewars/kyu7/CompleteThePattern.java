package codewars.kyu7;

public class CompleteThePattern {
    public static String pattern(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int temp = n;
            for (int j = 0; j < i; j++) {
                builder.append(temp);
                temp--;
            }
            if (i != 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
