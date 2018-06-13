package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CommandCenter;
import Factory.FactoryProducer;

public class Race {
    //private CCDirector CommandCenter;
    private CommandCenter command;
    //private FactoryProducer estructures;
    private int tempConstruct;
    private int cantDamage;
    private String raza;
    /*public CCDirector getCommandCenter() {
        return CommandCenter;
    }*/

    public void setCommand(CommandCenter commandC) {
        command = commandC;
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
