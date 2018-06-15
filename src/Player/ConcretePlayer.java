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

        validatingRaces(reign, scanner);
    }

    public void validatingRaces(Earth reign, Scanner scanner) {
        while (true) {
            System.out.println("'aliens' para Aliens \n'androids' para Androides \n'survivors' para Humanos sobrevivientes");
            String key = scanner.nextLine();
            if (!key.equals("aliens") && !key.equals("survivors") && !key.equals("androids")) {
                System.out.println("Read and try again");
                validatingRaces(reign, scanner);
            }
            switch (key) {
                case "aliens":
                    player.setRacename("Aliens");
                    RaceBuilder alien = new AliensBuilder();
                    reign.setRaceBuilder(alien);
                    reign.generateRace();
                    break;

                case "androids":
                    player.setRacename("Androids");
                    RaceBuilder android = new AndroidsBuilder();
                    reign.setRaceBuilder(android);
                    reign.generateRace();
                    break;

                case "survivors":
                    player.setRacename("Survivors");
                    RaceBuilder survivor = new SurvivorsBuilder();
                    reign.setRaceBuilder(survivor);
                    reign.generateRace();
                    break;

            }
            break;

        }
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

}
