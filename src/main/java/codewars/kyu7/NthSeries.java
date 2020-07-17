package codewars.kyu7;

import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum2(int n) {
        if (n == 0) {
            return "0.00";
        }
        double result = 0;
        double temp = 1;
        for (int i = 0; i < n; i++) {
            result += 1 / temp;
            temp += 3;
        }
        return String.valueOf(new DecimalFormat("0.00").format(result));
    }

    public static String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }
}
