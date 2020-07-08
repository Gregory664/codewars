package codewars.kyu8;

public class Ghost {
    public String getColor() {
        int color = (int) (Math.random() * 3);
        switch (color) {
            case 0:
                return "white";
            case 1:
                return "yellow";
            case 2:
                return "purple";
            case 3:
                return "red";
            default:
                return "boroda";
        }
    }
}
