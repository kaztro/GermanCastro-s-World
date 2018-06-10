package RacesBuilder;

import CommandCenter.CommandCenter;
import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AliensCC;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class AliensBuilder extends RaceBuilder {
    public AliensBuilder() {super.race = new Race();}

    @Override
    public void buildCommandCenter() {
        CCDirector cc = new CCDirector();
        CCBuilder cca = new AliensCC();
        cc.setCCBuilder(cca);
        cc.buildCommandCenter();

        //CommandCenter commandCenter = cc.getCommandCenter();
    }/*
    @Override
    public void buildEstructures(){
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("proletariat");
        Estructures estructures = factory.getEstructures("callcenter");
    }*/

    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(1);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(20);
    }

}

/*
    @Override
    public Race getRace() {
        return super.getRace();
    }

    @Override
    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void constructCommandCenter() {
        CommandCenter center = new CommandCenter();
        center.setLevel(0);
        center.setLife(100);
        race.setCommandCenter(center);
    }

    @Override
    public void generateEstructures() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("estructure");
        Estructures estructures = factory.getEstructures("comienzo");
    }

    @Override
    public void setTempConstruct() {
        race.setTempConstruct(1);
    }

    @Override
    public void setCantDamage() {
        race.setCantDamage(20);
    }
*/