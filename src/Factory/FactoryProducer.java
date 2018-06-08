package Factory;

import Estructures.Proletariat.FactoryEstructures;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "estructure":
                return new FactoryEstructures();
        }
        return null;
    }
}
