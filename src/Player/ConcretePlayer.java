package Player;

import RacesBuilder.AndroidsBuilder;
import RacesBuilder.Earth;
import RacesBuilder.Race;
import RacesBuilder.RaceBuilder;

import java.util.Scanner;

public class ConcretePlayer extends PlayerBuilder {
    public void buildName() {
        System.out.println("Ingresa el tu nickname");
        Scanner cin = new Scanner(System.in);
        String nickname = cin.nextLine();
        player.setName(nickname);
    }

    public void buildEarth() {
        Earth reign = new Earth();
        RaceBuilder AndroidsBuilder = new AndroidsBuilder();

        reign.setRaceBuilder(AndroidsBuilder);
        reign.generateRace();

        Race race = reign.getRace();
    }
}
