package RacesBuilder;

import CommandCenter.CommandCenter;
import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AndroidsCC;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class AndroidsBuilder extends RaceBuilder {


    public void generateRace() {
        super.generateRace();
    }

    public void constructCommandCenter() {
        CCDirector cc = new CCDirector();
        CCBuilder cca = new AndroidsCC();

        cc.setCCBuilder(cca);
        cc.buildCommandCenter();

        CommandCenter commandCenter = cc.getCommandCenter();
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
        race.setCantDamage(30);
    }
}
