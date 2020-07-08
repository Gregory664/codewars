package codewars.kyu8;

public class HQ {
    public static String HQ9(char code) {
        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return String.valueOf(code);
            case '9':
                return generateLyrics();
            default:
                return null;
        }
    }

    public static String generateLyrics() {
        int bottles = 99;
        StringBuilder builder = new StringBuilder();
        while (bottles > 1) {
            builder.append(bottles).append(" bottles of beer on the wall, ");
            builder.append(bottles).append(" bottles of beer.\n");
            builder.append("Take one down and pass it around, ").append(--bottles);
            if (bottles == 1) {
                builder.append(" bottle of beer on the wall.\n");
            } else {
                builder.append(" bottles of beer on the wall.\n");
            }
            if (bottles == 1) {
                builder.append(bottles).append(" bottle of beer on the wall, ");
                builder.append(bottles).append(" bottle of beer.\n");
                builder.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
                builder.append("No more bottles of beer on the wall, no more bottles of beer.\n");
                builder.append("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
        return builder.toString();
    }

}
