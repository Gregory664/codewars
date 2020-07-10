package codewars.kyu7;

public class Drinkin {
    public String hydrate(String drinkString) {
        int sum = drinkString.chars()
                .filter(Character::isDigit)
                .mapToObj(Character::getNumericValue)
                .mapToInt(Integer::intValue)
                .sum();
        return String.format("%d %s of water", sum, sum == 1 ? "glass" : "glasses");
    }
}
