package codewars.kyu7;

public class JumpingNumber {
    public static String jumpingNumber(int number) {
        int[] mass = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
        for (int i = 0; i < mass.length - 1; i++) {
            if(Math.abs(mass[i] - mass[i + 1]) > 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}
