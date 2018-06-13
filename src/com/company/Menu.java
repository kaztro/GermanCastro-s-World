package com.company;

import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Player.ConcretePlayer;
import Player.Director;
import Player.PlayerBuilder;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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

    public void gameOptions(PlayerBuilder p, int dinero, int energia, int materiales, String raceName, String m, String e, String a, String mat) {
        //DATOS QUEMADOS TEMPORALMENTE

        String name = p.givePlayerName();

        int opt = 0;

        AbstractFactory fact;

        while (opt != 5) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("¦                    You lead the " + raceName + "                     ¦");
            System.out.println("¦It's your turn " + name + " What do you wanna do now?                     ¦");
            System.out.println("¦Wallet: " + dinero + " energy: " + energia + " Materials: " + materiales + "      ¦");
            System.out.println("¦1.Build Energy Estructure                                             ¦");
            System.out.println("¦2.Build Money Estructure                                              ¦");
            System.out.println("¦3.Build Material Estructure                                           ¦");
            System.out.println("¦4.Build Materials Estructure                                          ¦");
            System.out.println("¦5.Build Vehicles                                                      ¦");
            System.out.println("-----------------------------------------------------------------------");
            try {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        fact = FactoryProducer.getFactory("energy");
                        fact.getEnergy(e);
                        break;
                    case 2:
                        fact = FactoryProducer.getFactory("proletariat");
                        fact.getEstructures(m);
                        break;
                    case 3:
                        fact = FactoryProducer.getFactory("materials");
                        fact.getMaterials(mat);
                        break;
                    case 4:
                        fact = FactoryProducer.getFactory("army");
                        fact.getArmy(a);
                    case 5:
                        fact = FactoryProducer.getFactory("vehicles");
                        System.out.println("Do you want a tank or a convoy? Write tank  or convoy: ");
                        String vehicle = scanner.nextLine();
                        fact.getVehicles(vehicle);
                }
            } catch (InputMismatchException E) {
                System.err.println("The number you've type It's not an Int");
            }
            scanner.nextLine();
        }

    }

    public void game() {
        /*
        AbstractFactory fact1, fact2, fact3, fact4;
        fact1 = FactoryProducer.getFactory("proletariat");
        fact2 = FactoryProducer.getFactory("army");
        fact3 = FactoryProducer.getFactory("energy");
        fact4 = FactoryProducer.getFactory("vehicles");
        */


        Director avatar = new Director(), avatar2 = new Director();

        int op = 0;

        while (op != 2) {

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

                        start(p1, p2, true);

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
        int[] num = {1, 2};
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            int result = r.nextInt(num.length);
            return result;
        }
        return 0;
    }

    public void start(PlayerBuilder p1, PlayerBuilder p2, Boolean firstTime) {
        if (firstTime == true) {
            int whoStarts = random();
            if (whoStarts == 1) {
                switch (p2.giveRaceName()) {
                    case "Aliens":
                        gameOptions(p2, 1000, 500, 400, p1.giveRaceName(), "loot", "solarenergy", "aliensarmy", "aliensmaterials");
                        break;
                    case "Survivors":
                        gameOptions(p2, 1000, 500, 400, p1.giveRaceName(), "callcenter", "energydrinks", "survivorsarmy", "survivorsmaterials");
                        break;
                    case "Androids":
                        gameOptions(p2, 1000, 500, 400, p1.giveRaceName(), "offset", "energydrinks", "androidsarmy", "androidsmaterials");
                        break;
                }

            }
            if (whoStarts == 0) {
                switch (p1.giveRaceName()) {
                    case "Aliens":
                        gameOptions(p1, p1.giveMoney(), 500, p1.giveMaterials(), p1.giveRaceName(), "loot", "solarenergy", "aliensarmy", "aliensmaterials");
                        break;
                    case "Androids":
                        gameOptions(p1, p1.giveMoney(), 500, p1.giveMaterials(, p1.giveRaceName(), "offset", "energydrinks", "androidsarmy", "adroidsmaterials");
                        break;
                    case "Survivors":
                        gameOptions(p1, p1.giveMoney(), 500, p1.giveMaterials(, p1.giveRaceName(), "callcenter", "energydrinks", "survivorsarmy", "survivorsmaterials");
                        break;
                }
            }
        }

    }
}