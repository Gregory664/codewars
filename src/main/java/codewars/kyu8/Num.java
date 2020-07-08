package codewars.kyu8;

public class Num {
    public static int nthEven(int n) {
        int even = -2;
        int countOfEven = 0;
        while (countOfEven != n) {
            countOfEven++;
            even += 2;
        }
        return even;
    }
}
