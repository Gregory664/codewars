package codewars.kyu8;

import java.text.DecimalFormat;

public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
//        double X = (x[0] + y[0] + z[0]) / 3D;
//        double Y = (x[1] + y[1] + z[1]) / 3D;
//        return new double[]{
//                (double) Math.round(X * 10000D) / 10000D,
//                (double) Math.round(Y * 10000D) / 10000D,
//        };

        return new double[]{
                Double.parseDouble(new DecimalFormat("##.####").format(x[0] + y[0] + z[0] / 3D)),
                Double.parseDouble(new DecimalFormat("##.####").format(x[1] + y[1] + z[1] / 3D)),
        };
    }
}
