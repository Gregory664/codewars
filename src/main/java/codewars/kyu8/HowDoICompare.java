package codewars.kyu8;

public class HowDoICompare {
    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String) p[1];
        }
        return "nothing";
    }
}
