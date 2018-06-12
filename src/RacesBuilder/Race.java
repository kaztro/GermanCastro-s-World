package RacesBuilder;

import CommandCenter.CCDirector;
import Factory.FactoryProducer;

public class Race {
    private CCDirector CommandCenter;
    private FactoryProducer estructures;
    private int tempConstruct;
    private int cantDamage;
    private String raza;
    /*public CCDirector getCommandCenter() {
        return CommandCenter;
    }*/

    public void setCommandCenter(CCDirector commandCenter) {
        CommandCenter = commandCenter;
    }
/*
    public void setEstructures(FactoryProducer factoryProducer) {
        estructures = factoryProducer;
    }

    public FactoryProducer getEstructures() {
        return estructures;
    }*/

    public void setTempConstruct(int tempConstruct) {
        this.tempConstruct = tempConstruct;
    }

    public void setCantDamage(int cantDamage) {
        this.cantDamage = cantDamage;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
