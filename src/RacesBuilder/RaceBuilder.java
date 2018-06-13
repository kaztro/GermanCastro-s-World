package RacesBuilder;

import CommandCenter.CommandCenter;

public abstract class RaceBuilder {
    protected Race race = new Race();

    public Race getRace() {
        return race;
    }

    public void generateRace(){
        race = new Race();
    }

    public abstract void buildCommandCenter();

    public abstract void buildTempConstruct();

    public abstract void buildCantDamage();

    public abstract int giveMoney();

    public abstract int giveLife();

    public abstract int giveMaterials();

    public abstract int giveLevel();

    //public CommandCenter getCommandCenter() {return new CommandCenter();}
}
