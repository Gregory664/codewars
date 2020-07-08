package codewars.kyu8;

public class ThinkingAndTesting {
    public static int testAB(int a, int b) {
        return (a + b) % 2 != 0 ?
                a + b :
                ((a + b) / 10) == 0 ?
                        a + b :
                        a * b;
    }
}
