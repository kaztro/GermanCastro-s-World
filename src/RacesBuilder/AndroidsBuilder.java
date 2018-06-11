package RacesBuilder;

import CommandCenter.CommandCenter;
import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AndroidsCC;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

public class AndroidsBuilder extends RaceBuilder {


    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void buildCommandCenter() {
        CCDirector cc = new CCDirector();
        CCBuilder cca = new AndroidsCC();

        cc.setCCBuilder(cca);
        cc.buildCommandCenter();

        //CommandCenter commandCenter = cc.getCommandCenter();
    }


        @Override
        public void buildEstructures() {
            AbstractFactory factory;
            factory = FactoryProducer.getFactory("estructure");
            //System.out.println("hola");
            //Estructures estructures = factory.getEstructures("comienzo");
            //System.out.println("holap");
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
