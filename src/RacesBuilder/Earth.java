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
        //raceBuilder.buildEstructures();
        raceBuilder.buildTempConstruct();
        raceBuilder.buildCantDamage();
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

