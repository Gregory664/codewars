package codewars.kyu8;

public class BitCounting {
    public static int countBits(int n) {
//        return Integer.toBinaryString(n).chars()
//                .filter(i -> i == '1')
//                .map(Character::getNumericValue)
//                .sum();

        return Integer.bitCount(n);

//        return Arrays.stream(Integer.toBinaryString(n).split(""))
//                .filter(s -> s.equals("1"))
//                .mapToInt(Integer::parseInt)
//                .sum();
    }
}
