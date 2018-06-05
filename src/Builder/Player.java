package Builder;

import Races.Races;

public class Player {
    private final String name;
    private final Races race;
    private Player (PlayerBuilder builder){
        this.name = builder.name;
        this.race = builder.race;
    }

    public String getName() {
        return name;
    }

    public Races getRace() {
        return race;
    }

    public static class PlayerBuilder {
        private final String name;
        private final Races race;

        public PlayerBuilder (String name, Races race){
            this.name = name;
            this.race = race;
        }

        public Player build(){
            return new Player(this);
        }
    }
}
