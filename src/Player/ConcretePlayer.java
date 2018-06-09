package Player;

import RacesBuilder.*;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para escoger la raza a la que quieres pertenecer escribe: ");
        System.out.println("'aliens' para Aliens \n'androids' para Androides \n'survivors' para Humanos sobrevivientes");
        String key = scanner.nextLine();

        switch (key) {
            case "aliens":
                RaceBuilder AliensBuilder = new AliensBuilder();
                reign.setRaceBuilder(AliensBuilder);
                reign.generateRace();
                //Race race1 = reign.getRace();
            case "androids":
                RaceBuilder AndroidsBuilder = new AndroidsBuilder();
                reign.setRaceBuilder(AndroidsBuilder);
                reign.generateRace();
                //Race race2 = reign.getRace();
            case "survivors":
                RaceBuilder SurvivorsBuilder = new SurvivorsBuilder();
                reign.setRaceBuilder(SurvivorsBuilder);
                reign.generateRace();
                //Race race3 = reign.getRace();
        }
        /*
        RaceBuilder AndroidsBuilder = new AndroidsBuilder();

        reign.setRaceBuilder(AndroidsBuilder);
        reign.generateRace();

        Race race = reign.getRace();*/
    }
}
