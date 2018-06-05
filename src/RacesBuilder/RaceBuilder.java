package RacesBuilder;

public abstract class RaceBuilder {
    protected Race race;

    public Race getRace() {
        return race;
    }

    public void generateRace(){
        race = new Race();
    }

    public abstract void constructCommandCenter();

    public abstract void generateEstructures();

    public abstract void setTempConstruct ();

    public abstract void setCantDamage();
}
