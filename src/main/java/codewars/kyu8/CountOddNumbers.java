package codewars.kyu8;

public class CountOddNumbers {
    public static int oddCount(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
