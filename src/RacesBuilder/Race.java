package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CommandCenter;
import Factory.FactoryProducer;

public class Race {
    //private CCDirector CommandCenter;
    private CCDirector command;
    //private FactoryProducer estructures;
    private int tempConstruct;
    private int cantDamage;
    private String raza;
    /*public CCDirector getCommandCenter() {
        return CommandCenter;
    }*/

    public CCDirector getCommand() {
        return command;
    }

    public void setCommand(CCDirector command) {
        this.command = command;
    }

    /*
        public void setCommand(CommandCenter commandC) {
            command = commandC;
        }

        public CommandCenter getCommand() {
            return command;
        }
    */
    public int getTempConstruct() {
        return tempConstruct;
    }

    public int getCantDamage() {
        return cantDamage;
    }

    public String getRaza() {
        return raza;
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
