package List;

import Estructures.Army.AndroidsArmy;
import Estructures.Army.Army;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

import java.util.ArrayList;

public class AndroidsArmyList implements List {
    private ArrayList<AndroidsArmy> army;

    public AndroidsArmyList() {
        army = new ArrayList<>();
    }

    @Override
    public void addArmy() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("army");
        Army armyestruct = factory.getArmy("androidsarmy");
    }

    public void addArmy(AndroidsArmy aArmy) throws Exception {
        if (aArmy != null) {
            if (!army.contains(aArmy)) {
                army.add(aArmy);
            } else {
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
