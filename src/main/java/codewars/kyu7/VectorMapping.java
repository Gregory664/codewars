package codewars.kyu7;

public class VectorMapping {
    public static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        double transformCoefficient = circle2[2] / circle1[2];
        double transformX = vector[0] < circle1[0] ?
                circle2[0] - ((circle1[0] - vector[0]) * transformCoefficient) :
                circle2[0] + ((vector[0] - circle1[0]) * transformCoefficient);
        double transformY = vector[1] < circle1[1] ?
                circle2[1] - ((circle1[1] - vector[1]) * transformCoefficient) :
                circle2[1] + ((vector[1] - circle1[1]) * transformCoefficient);
        return new double[]{
                Math.round(transformX * 100) / 100D,
                Math.round(transformY * 100) / 100D,
        };
    }
}
