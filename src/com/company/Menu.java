package com.company;

import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Player.Player;
//import RacesBuilder.Earth;
import Player.PlayerBuilder;
import Player.ConcretePlayer;

import java.util.Scanner;

public class Menu {
    public void options() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                   WELCOME TO GERMAN'S WOLRD!                       |");
        System.out.println("|Select one of the races and write your nickname:                    |");
        System.out.println("|                                                           |");
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

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                p1.buildName();
                p1.buildEarth();

                p2.buildName();
                p2.buildEarth();


        }
    }
}
