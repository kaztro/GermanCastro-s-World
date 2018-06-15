package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AndroidsCC;

public class AndroidsBuilder extends RaceBuilder {
    CCDirector cc = new CCDirector();
    CCBuilder cca = new AndroidsCC();

    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void buildCommandCenter() {


        cc.setCCBuilder(cca);
        cc.buildCommandCenter();

    }


    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(2);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(30);
    }



}
