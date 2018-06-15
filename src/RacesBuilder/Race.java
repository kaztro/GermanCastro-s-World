package RacesBuilder;

import CommandCenter.CCDirector;

public class Race {
    private CCDirector command;
    private int tempConstruct;
    private int cantDamage;
    private String raza;


    public CCDirector getCommand() {
        return command;
    }

    public void setCommand(CCDirector command) {
        this.command = command;
    }


    public int getTempConstruct() {
        return tempConstruct;
    }

    public int getCantDamage() {
        return cantDamage;
    }

    public String getRaza() {
        return raza;
    }

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
