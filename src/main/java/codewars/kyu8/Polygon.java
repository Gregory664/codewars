package codewars.kyu8;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        double tan = Math.tan(Math.toRadians(360D / (2 * sides)));
        return sideLength / (2 * tan) * 2;
    }
}
