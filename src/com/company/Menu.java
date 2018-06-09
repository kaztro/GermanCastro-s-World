package com.company;

import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Player.Player;
//import RacesBuilder.Earth;
import Player.PlayerBuilder;
import Player.ConcretePlayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void options() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("¦                   WELCOME TO GERMAN'S WOLRD!                         ¦");
        System.out.println("¦1.Select one of the races and write your nickname for player 1 and 2: ¦");
        System.out.println("¦2.Build Energy Estructure                                             ¦");
        System.out.println("¦3.Build Money Estructure                                              ¦");
        System.out.println("¦4.Build Material Estructure                                           ¦");
        System.out.println("¦5.Build Army Estructure                                               ¦");
        System.out.println("¦6.Build Vehicles                                                      ¦");
        System.out.println("¦7.Exit                                                                ¦");
        System.out.println("-----------------------------------------------------------------------");
    }

    public void game() {

        Player avatar = new Player();
        PlayerBuilder p1 = new ConcretePlayer();


        Player avatar2 = new Player();
        PlayerBuilder p2 = new ConcretePlayer();

        AbstractFactory fact1, fact2, fact3, fact4;
        fact1 = FactoryProducer.getFactory("proletariat");
        fact2 = FactoryProducer.getFactory("army");
        fact3 = FactoryProducer.getFactory("energy");
        fact4 = FactoryProducer.getFactory("vehicles");

        Scanner scanner = new Scanner(System.in);

        int op = 0;

        while (op != 7) {

            options();
            try {
                op = scanner.nextInt();

                switch (op) {
                    case 1:
                        p1.buildName();
                        p1.buildEarth();

                        p2.buildName();
                        p2.buildEarth();

                    default:
                        System.out.println("The number you type It's not part of the options or maybe It's not a number.\nPlease read the menu");
                }
            } catch (InputMismatchException E) {
                System.err.println("The number you've type It's not an Int");
            }
            scanner.nextLine();
        }
    }
}
