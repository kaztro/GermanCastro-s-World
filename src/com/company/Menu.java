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

    public void gameOptions(PlayerBuilder p, int dinero, int energia, int materiales) {
        //DATOS QUEMADOS TEMPORALMENTE

        String name = p.givePlayerName();

        int opt = 0;

        AbstractFactory fact1, fact2, fact3, fact4;

        fact1 = FactoryProducer.getFactory("proletariat");
        fact2 = FactoryProducer.getFactory("army");
        fact3 = FactoryProducer.getFactory("energy");
        fact4 = FactoryProducer.getFactory("vehicles");

        while (opt != 2) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("¦Es tu turno " + name + " Que deseas hacer?                            ¦");
            System.out.println("¦Dinero: " + dinero + " Energia: " + energia + " Materiales: " + materiales + "    ¦");
            System.out.println("¦1.Build Energy Estructure                                             ¦");
            System.out.println("¦2.Build Money Estructure                                              ¦");
            System.out.println("¦3.Build Material Estructure                                           ¦");
            System.out.println("¦4.Build Army Estructure                                               ¦");
            System.out.println("¦5.Build Vehicles                                                      ¦");
            System.out.println("¦6.Exit                                                                ¦");
            System.out.println("-----------------------------------------------------------------------");
            try {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:

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
                        System.exit(0);
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
                gameOptions(p2, 1000, 500, 400);
            }
            if (whoStarts == 0) {
                gameOptions(p1, 1000, 500, 400);
            }
        }
    }
/*
    public void workingBhru() {

    }*/
}
