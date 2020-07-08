package codewars.kyu8;

public class RemoveNExclamationMarks {
    public static String remove(String s, int n) {
//        StringBuilder builder = new StringBuilder();
//        int count = 0;
//        for (int i = 0; i < s.toCharArray().length; i++) {
//            if(s.charAt(i) == '!' && count != n) {
//                count ++;
//            } else {
//                builder.append(s.charAt(i));
//            }
//        }
//        return builder.toString();
        while (n-- > 0) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }
}
