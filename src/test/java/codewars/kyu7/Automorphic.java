package codewars.kyu7;

public class Automorphic {
    public static String autoMorphic(int number) {
        return String.valueOf(number * number).endsWith(String.valueOf(number)) ? "Automorphic" : "Not!!";
    }
}
