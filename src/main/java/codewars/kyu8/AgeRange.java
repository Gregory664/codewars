package codewars.kyu8;

public class AgeRange {
    public static String datingRange(int age) {
        String[] strings = {"asd", "asd"};
        String.join("", strings);
        return age <= 14 ?
                (int) (age - (age * 0.1)) + "-" + (int) (age + (age * 0.1)) :
                (age / 2 + 7) + "-" + ((age - 7) * 2);
    }
}
