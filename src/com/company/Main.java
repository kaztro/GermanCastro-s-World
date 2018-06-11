package com.company;

import Estructures.Army.Army;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class Main {

    public static void main(String[] args) {

        Menu menu = Menu.getInstance();
        menu.game();

        /*
        AbstractFactory factory = FactoryProducer.getFactory("army");
        Army army = factory.getArmy("aliensarmy");
        army.GenerateSquad();*/
    }
}

