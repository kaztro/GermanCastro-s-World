package Estructures;

import Estructures.SuEstructures.SurvivorsArmy;
import Estructures.SuEstructures.CallCenter;
import Factory.AbstractFactory;
import Races.Races;

public class FactoryEstructures implements AbstractFactory {
    @Override
    public Estructures getEstructures(String type){
        switch(type){
            case "armada":
                return new SurvivorsArmy();
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
