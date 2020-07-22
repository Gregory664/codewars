package codewars.kyu7;

public class SetBits {
    public long eliminateUnsetBits(String number) {
        number = number.replace("0", "");
        return number.length() == 0 ? 0 : Long.parseLong(number, 2);
    }
}
