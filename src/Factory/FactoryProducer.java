package Factory;

import Estructures.FactoryEstructures;
import Races.FactoryRaces;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "estructure":
                return new FactoryEstructures();
            case "races":
                return new FactoryRaces();
        }
        return null;
    }
}
