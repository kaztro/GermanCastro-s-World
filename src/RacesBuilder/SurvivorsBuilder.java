package RacesBuilder;

import Estructures.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class SurvivorsBuilder extends RaceBuilder {


    public void generateRace() {
        super.generateRace();
    }

    public void constructCommandCenter() {
        CommandCenter center = new CommandCenter();
        center.setLevel(0);
        center.setLife(100);
        race.setCommandCenter(center);
    }

    public void generateEstructures() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("estructure");
        Estructures estructures = factory.getEstructures("comienzo");
    }

    public void TempConstruct() {
        race.setTempConstruct(2);
    }

    public void CantDamage() {
        race.setCantDamage(20);
    }
}
