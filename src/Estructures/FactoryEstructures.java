package Estructures;

import Factory.AbstractFactory;
import Races.Races;

public class FactoryEstructures implements AbstractFactory {
    @Override
    public Estructures getEstructures(String type){
        switch(type){
            case "armada":
                return new Army();
            case "callcenter":
                return new CallCenter();
        }
        return null;
    }
    @Override
    public Races getRaces(String type){
        return null;
    }
}
