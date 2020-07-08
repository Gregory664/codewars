package codewars.kyu8;

public class HoWOldWill {
    public static String CalculateAge(int birth, int yearTo) {
        return birth > yearTo ? String.format("You will be born in %d %s.", birth - yearTo, birth - yearTo == 1 ? "year" : "years") :
                birth < yearTo ? String.format("You are %d %s old.", yearTo - birth, yearTo - birth == 1 ? "year" : "years") :
                        "You were born this very year!";
    }
}
