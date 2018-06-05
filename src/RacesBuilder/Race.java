package RacesBuilder;

import Estructures.Estructures;

public class Race {
    private CommandCenter CommandCenter;
    private Estructures estructure;
    private int tempConstruct;
    private int cantDamage;

    public RacesBuilder.CommandCenter getCommandCenter() {
        return CommandCenter;
    }

    public void setCommandCenter(RacesBuilder.CommandCenter commandCenter) {
        CommandCenter = commandCenter;
    }

    public Estructures getEstructure() {
        return estructure;
    }

    public void setEstructure(Estructures estructure) {
        this.estructure = estructure;
    }

    public int getTempConstruct() {
        return tempConstruct;
    }

    public void setTempConstruct(int tempConstruct) {
        this.tempConstruct = tempConstruct;
    }

    public int getCantDamage() {
        return cantDamage;
    }

    public void setCantDamage(int cantDamage) {
        this.cantDamage = cantDamage;
    }
}
