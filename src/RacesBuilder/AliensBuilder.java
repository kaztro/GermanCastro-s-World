package RacesBuilder;

import Estructures.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class AliensBuilder extends RaceBuilder {
    public AliensBuilder() {super.race = new Race();}

    public void constructCommandCenter() {
        CommandCenter center = new CommandCenter();
        center.setLevel(0);
        center.setLife(100);
        race.setCommandCenter(center);
    }
    public void generateEstructures(){
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("estructure");
        Estructures estructures = factory.getEstructures("comienzo");
    }
    public void TempConstruct (){
        race.setTempConstruct(1);
    }
    public void CantDamage(){
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
/*