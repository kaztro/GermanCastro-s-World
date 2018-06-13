package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.CommandCenter;
import CommandCenter.SurvivorsCC;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class SurvivorsBuilder extends RaceBuilder {
    CCDirector cc = new CCDirector();
    CCBuilder ccs = new SurvivorsCC();

    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void buildCommandCenter() {
        cc.setCCBuilder(ccs);
        cc.buildCommandCenter();

        //CommandCenter commandCenter = cc.getCommandCenter();
    }

    /*

            @Override
            public void buildEstructures() {
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("estructure");
                //Estructures estructures = factory.getEstructures("comienzo");
            }*/
    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(2);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(20);
    }

    @Override
    public int giveMoney() {
        return ccs.getMoney();
    }

    @Override
    public int giveLife() {
        return ccs.getLife();
    }

    @Override
    public int giveMaterials() {
        return ccs.getMaterials();
    }

    @Override
    public int giveLevel() {
        return ccs.getLevel();
    }
}
