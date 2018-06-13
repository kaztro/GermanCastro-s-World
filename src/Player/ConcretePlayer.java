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
                player.setRacename("Aliens");
                RaceBuilder alien = new AliensBuilder();
                reign.setRaceBuilder(alien);
                reign.generateRace();
                giveMoney(alien);
                giveLevel(alien);
                giveLife(alien);
                giveMaterials(alien);
                //Race race1 = reign.getRace();
            case "androids":
                player.setRacename("Androids");
                RaceBuilder android = new AndroidsBuilder();
                reign.setRaceBuilder(android);
                reign.generateRace();
                giveMoney(android);
                giveLevel(android);
                giveLife(android);
                giveMaterials(android);
                //Race race2 = reign.getRace();
            case "survivors":
                player.setRacename("Survivors");
                RaceBuilder survivor = new SurvivorsBuilder();
                reign.setRaceBuilder(survivor);
                reign.generateRace();
                giveMoney(survivor);
                giveLevel(survivor);
                giveLife(survivor);
                giveMaterials(survivor);
                //Race race3 = survivor.getRace();
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

    @Override
    public String givePlayerName() {
        return super.givePlayerName();
    }

    @Override
    public String giveRaceName() {
        return super.giveRaceName();
    }


    @Override
    public int giveMoney(RaceBuilder a) {
        return a.giveMoney();
    }

    @Override
    public int giveLife(RaceBuilder a) {
        return a.giveLife();
    }

    @Override
    public int giveMaterials(RaceBuilder a) {
        return a.giveMaterials();
    }

    @Override
    public int giveLevel(RaceBuilder a) {
        return a.giveLevel();
    }
}
