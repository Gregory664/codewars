package codewars.kyu8;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        while (goose > players.length) {
            goose -= players.length;
        }
        return players[--goose].name;
    }

    public static class Player {
        private String name;

        public Player(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
