package codewars.kyu8;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int num = (s1 + s2 + s3) / 3;
        return num < 60 ? 'F' :
                num < 70 ? 'D' :
                        num < 80 ? 'C' :
                                num < 90 ? 'B' : 'A';
    }
}
