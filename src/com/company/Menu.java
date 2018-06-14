package com.company;

import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Player.ConcretePlayer;
import Player.Director;
import Player.PlayerBuilder;
import RacesBuilder.Race;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Menu {
    private static Menu menu;

    Scanner scanner = new Scanner(System.in);


    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void firstOptions() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("¦                   WELCOME TO GERMAN'S WOLRD!                         ¦");
        System.out.println("¦1.Select one of the races and write your nickname for player 1 and 2: ¦");
        System.out.println("¦2.Exit                                                                ¦");
        System.out.println("-----------------------------------------------------------------------");
    }

    public void gameOptions(PlayerBuilder p, int dinero, int energia, int materiales, int level, int fase, String m, String e, String a, String mat, String v, PlayerBuilder next) {

        int opt = 0;

        AbstractFactory fact;
        while (opt != 6) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("¦                  You lead the " + p.getPlayer().getRacename() + "        ");
            System.out.println("¦ Your Command Center Level is " + level + "                               ");
            System.out.println("¦It's your turn " + p.getPlayer().getName() + " What do you wanna do now?  ");
            System.out.println("¦Wallet: " + dinero + " energy: " + energia + " Materials: " + materiales + "      ");
            System.out.println("¦1.Build Energy Structure                                              ");
            System.out.println("¦2.Build Money Structure                                               ");
            System.out.println("¦3.Build Material Structure                                            ");
            System.out.println("¦4.Build Army Structure                                                ");
            System.out.println("¦5.Build Vehicles                                                      ");
            System.out.println("¦6.Next                                                                ");
            System.out.println("¦                                                        Fase: " + fase + "");
            System.out.println("-----------------------------------------------------------------------");
            try {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        fact = FactoryProducer.getFactory("energy");
                        assert fact != null;
                        fact.getEnergy(e).GenerateEnergy();
                        break;
                    case 2:
                        fact = FactoryProducer.getFactory("proletariat");
                        assert fact != null;
                        fact.getEstructures(m).GenerateMoney();
                        break;
                    case 3:
                        fact = FactoryProducer.getFactory("materials");
                        assert fact != null;
                        fact.getMaterials(mat).GenerateMaterials();
                        break;
                    case 4:
                        fact = FactoryProducer.getFactory("army");
                        validatingArmy(fact, a);
                    case 5:
                        fact = FactoryProducer.getFactory("vehicles");
                        validatingVehicle(fact, v);
                        break;
                    case 6:
                        start(p, next, false, fase);
                        break;
                    default:
                        System.out.println("The number you type It's not part of the options or maybe It's not a number.\nPlease read the menu");
                }
            } catch (InputMismatchException E) {
                System.err.println("The number you've type It's not an Int");
            }
            scanner.nextLine();
        }

    }

    public void validatingArmy(AbstractFactory fact, String a) {
        while (true) {
            System.out.println("Do you want soldiers or a super soldier? Write soldiers  or ss: ");
            String army = scanner.nextLine();
            if (!army.equals("soldiers") && !army.equals("ss")) {
                System.out.println("Read and try again");
                validatingArmy(fact, a);
            }
            switch (army) {
                case "soldiers":
                    fact.getArmy(a).GenerateSquad();
                    break;
                case "ss":
                    fact.getArmy(a).GenerateSuperSoldier();
                    break;
            }

            break;
        }
    }

    public void validatingVehicle(AbstractFactory fact, String v) {
        while (true) {
            System.out.println("Do you want a tank or a convoy? Write tank  or convoy: ");
            String army = scanner.nextLine();
            if (!army.equals("tank") && !army.equals("convoy")) {
                System.out.println("Read and try again");
                validatingArmy(fact, v);
            }
            switch (army) {
                case "tank":
                    fact.getVehicles(v).GenerateTank();
                    break;
                case "convoy":
                    fact.getVehicles(v).GenerateConvoy();
                    break;
            }
            break;
        }
    }

    public void game() {

        Director avatar = new Director(), avatar2 = new Director();

        int op = 0;

        while (op != 2) {
            //test();
            firstOptions();
            try {
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        PlayerBuilder p1 = new ConcretePlayer();
                        avatar.setPlayerBuilder(p1);
                        avatar.buildPlayer();
                        //Player player1 = avatar.getPlayer();
                        //System.out.println(player1);
                        PlayerBuilder p2 = new ConcretePlayer();
                        avatar2.setPlayerBuilder(p2);
                        avatar2.buildPlayer();
                        //Player player2 = avatar.getPlayer();
                        //System.out.println(player2);

                        start(p1, p2, true, 1);

                    case 2:
                        System.exit(-1);
                    default:
                        System.out.println("The number you type It's not part of the options or maybe It's not a number.\nPlease read the menu");
                }
            } catch (InputMismatchException E) {
                System.err.println("The number you've type It's not an Int");
            }
            scanner.nextLine();
            //System.out.println(random());
        }

    }


    public int random() {
        /*int[] num = {1, 2};
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            int result = r.nextInt(num.length);
            return result;
        }*/
        return ThreadLocalRandom.current().nextInt(1, 2 + 1);
    }

    public void start(PlayerBuilder p1, PlayerBuilder p2, Boolean firstTime, int fase) {
        if (firstTime) {
            int whoStarts = random();
            if (whoStarts == 1) {
                switch (p2.getPlayer().getRacename()) {
                    case "Aliens":
                        gameOptions(p2, 0, 500, 1, 2, fase, "loot", "solarenergy", "aliensarmy", "aliensmaterials", "aliensvehicles", p1);
                        break;
                    case "Survivors":
                        gameOptions(p2, 0, 500, 1, 2, fase, "callcenter", "energydrinks", "survivorsarmy", "survivorsmaterials", "survivorsvehicles", p1);
                        break;
                    case "Androids":
                        gameOptions(p2, 0, 500, 1, 2, fase, "offset", "energydrinks", "androidsarmy", "androidsmaterials", "androidsvehicles", p1);
                        break;
                }

            }
            if (whoStarts == 2) {

                switch (p1.getPlayer().getRacename()) {
                    case "Aliens":
                        gameOptions(p1, 3, 500, 4, 0, fase, "loot", "solarenergy", "aliensarmy", "aliensmaterials", "aliensvehicles", p2);
                        break;
                    case "Androids":
                        gameOptions(p1, 3, 500, 4, 0, fase, "offset", "energydrinks", "androidsarmy", "adroidsmaterials", "androidsvehicles", p2);
                        break;
                    case "Survivors":
                        gameOptions(p1, 3, 500, 4, 0, fase, "callcenter", "energydrinks", "survivorsarmy", "survivorsmaterials", "survivorsvehicles", p2);
                        break;
                }
            }
        } else {
            fase += 1;
            switch (p2.getPlayer().getRacename()) {
                case "Survivors":
                    gameOptions(p2, 0, 500, 1, 2, fase, "callcenter", "energydrinks", "survivorsarmy", "survivorsmaterials", "survivorsvehicles", p1);
                    break;
                case "Androids":
                    gameOptions(p2, 0, 500, 1, 2, fase, "offset", "energydrinks", "androidsarmy", "androidsmaterials", "androidsvehicles", p1);
                    break;
                case "Aliens":
                    gameOptions(p2, 0, 500, 1, 2, fase, "loot", "solarenergy", "aliensarmy", "aliensmaterials", "aliensvehicles", p1);
                    break;
            }
        }
    }
}