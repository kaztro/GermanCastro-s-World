package List;

import Estructures.Army.AliensArmy;
import Estructures.Army.Army;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

import java.util.ArrayList;

public class AliensArmyList implements List {
    private ArrayList<AliensArmy> army;

    public AliensArmyList() {
        army = new ArrayList<>();
    }

    @Override
    public void addArmy() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("army");
        Army armyestruct = factory.getArmy("aliensarmy");
    }

    public void addArmy(AliensArmy aArmy) throws Exception {
        if(aArmy != null) {
            if (!army.contains(aArmy)){ army.add(aArmy);} else {
                Exception e = new Exception("You are sending clones!");
                throw e;
            }
        } else {
            throw new Exception("You're sending me phantom soldiers, we can't fight with that!!");
        }
    }

    @Override
    public void show() {
        System.out.println("Hasta aqui te quedaste we :'v ve a dormir...");
    }
}
