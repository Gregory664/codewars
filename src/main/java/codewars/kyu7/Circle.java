package codewars.kyu7;

public class Circle {
    public static double area(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        return Math.round((Math.PI * radius * radius) * 100) / 100D;
    }
}
