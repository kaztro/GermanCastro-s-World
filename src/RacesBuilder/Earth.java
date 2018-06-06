package RacesBuilder;

public class Earth {
    private RaceBuilder raceBuilder;


    public void setRaceBuilder(RaceBuilder rb) {
        RaceBuilder = rb;
    }

    public Race getRace() {
        return raceBuilder.getRace();
    }

    public void generateRace(){
        raceBuilder.constructCommandCenter();
        raceBuilder.TempConstruct();
        raceBuilder.CantDamage();
    }
}

/*
    public void generate_Race() {
        raceBuilder.setCantDamage();
        raceBuilder.setTempConstruct();
        raceBuilder.constructCommandCenter();
        raceBuilder.generateEstructures();
    }

    public void setRaceBuilder(RaceBuilder rb) {
        RaceBuilder = rb;
    }

    public Race getRace() {
        return raceBuilder.getRace();
    }*/

