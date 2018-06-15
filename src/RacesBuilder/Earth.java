package RacesBuilder;

public class Earth {
    private RaceBuilder raceBuilder;


    public void setRaceBuilder(RaceBuilder rb) {
        raceBuilder = rb;
    }

    public Race getRace() {
        return raceBuilder.getRace();
    }

    public void generateRace(){
        raceBuilder.buildCommandCenter();
        raceBuilder.buildTempConstruct();
        raceBuilder.buildCantDamage();
    }
}


