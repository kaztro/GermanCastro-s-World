package RacesBuilder;

public abstract class RaceBuilder {
    protected Race race = new Race();

    public Race getRace() {
        return race;
    }

    public void generateRace(){
        race = new Race();
    }

    public abstract void buildCommandCenter();

    //public abstract void buildEstructures();

    public abstract void buildTempConstruct();

    public abstract void buildCantDamage();

    public abstract String returnName();
}
