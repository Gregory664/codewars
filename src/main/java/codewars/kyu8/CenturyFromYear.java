package codewars.kyu8;

public class CenturyFromYear {
    public static int century(int number) {

        return number % 10 > 0 ? number / 100 + 1 :
                number % 100 > 0 ? number / 100 + 1 : number / 100;
    }


}
