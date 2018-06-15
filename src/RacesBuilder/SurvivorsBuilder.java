package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.SurvivorsCC;

public class SurvivorsBuilder extends RaceBuilder {
    CCDirector cc = new CCDirector();
    CCBuilder ccs = new SurvivorsCC();

    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void buildCommandCenter() {
        cc.setCCBuilder(ccs);
        cc.buildCommandCenter();

    }

    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(2);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(20);
    }

}
