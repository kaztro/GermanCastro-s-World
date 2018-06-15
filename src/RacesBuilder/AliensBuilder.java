package RacesBuilder;

import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AliensCC;

public class AliensBuilder extends RaceBuilder {


    CCDirector cc = new CCDirector();
    CCBuilder cca = new AliensCC();

    @Override
    public void buildCommandCenter() {
        cc.setCCBuilder(cca);
        cc.buildCommandCenter();


    }

    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(1);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(20);
    }


}

