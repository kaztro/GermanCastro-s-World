package RacesBuilder;

import CommandCenter.CCDirector;
import Estructures.Estructures;

public class Race {
    private CCDirector CommandCenter;
    private Estructures estructure;
    private int tempConstruct;
    private int cantDamage;

    public CommandCenter.CommandCenter getCommandCenter() {
        return CommandCenter;
    }

    public void setCommandCenter(CCDirector commandCenter) {
        CommandCenter = commandCenter;
    }

    public void setEstructure(Estructures estructure) {
        this.estructure = estructure;
    }

    public void setTempConstruct(int tempConstruct) {
        this.tempConstruct = tempConstruct;
    }

    public void setCantDamage(int cantDamage) {
        this.cantDamage = cantDamage;
    }
}
