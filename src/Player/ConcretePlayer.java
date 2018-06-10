package Player;

import RacesBuilder.*;

import java.util.Scanner;

public class ConcretePlayer extends PlayerBuilder {
    @Override
    public void buildName() {
        System.out.println("Nickname: ");
        Scanner cin = new Scanner(System.in);
        String nickname = cin.nextLine();
        player.setName(nickname);
    }

    @Override
    public void buildEarth() {
        Earth reign = new Earth();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para escoger la raza a la que quieres pertenecer escribe: ");
        System.out.println("'aliens' para Aliens \n'androids' para Androides \n'survivors' para Humanos sobrevivientes");
        String key = scanner.nextLine();

        switch (key) {
            case "aliens":
                RaceBuilder alien = new AliensBuilder();
                reign.setRaceBuilder(alien);
                reign.generateRace();
                //Race race1 = reign.getRace();
            case "androids":
                RaceBuilder android = new AndroidsBuilder();
                reign.setRaceBuilder(android);
                reign.generateRace();
                //Race race2 = reign.getRace();
            case "survivors":
                RaceBuilder survivor = new SurvivorsBuilder();
                reign.setRaceBuilder(survivor);
                reign.generateRace();
                //Race race3 = reign.getRace();
        }

        /*
        RaceBuilder AndroidsBuilder = new AndroidsBuilder();

        reign.setRaceBuilder(AndroidsBuilder);
        reign.generateRace();

        Race race = reign.getRace();*/
    }

    @Override
    public void createNewPlayer() {
        super.createNewPlayer();
    }
}
