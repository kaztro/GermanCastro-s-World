package Races;

import Estructures.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class Aliens implements Races {
    @Override
    public Estructures estructures() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("estructure");
        Estructures estructures = factory.getEstructures("commandcenter");
    }
}
