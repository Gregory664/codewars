package codewars.kyu8;

public class HumanYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears, dogYears;
        switch (humanYears) {
            case 1:
                catYears = 15;
                dogYears = 15;
                break;
            case 2:
                catYears = 24;
                dogYears = 24;
                break;
            default:
                catYears = 24 + ((humanYears - 2) * 4);
                dogYears = 24 + ((humanYears - 2) * 5);
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}
