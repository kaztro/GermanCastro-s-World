package Races;

import Estructures.Estructures;
import Factory.AbstractFactory;

public class FactoryRaces implements AbstractFactory {
    @Override
    public Races getRaces(String type){
        switch(type){
            case "aliens":
                return new Aliens();
            case "androids":
                return new Androids();
            case "survivors":
                return new Survivors();
        }
        return null;
    }
    @Override
    public Estructures getEstructures(String type){
        return null;
    }
}
