package Player;

import RacesBuilder.Earth;

public class Player {
    private String name;
    private Earth race;

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Earth race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public Earth getRace() {
        return race;
    }
}

