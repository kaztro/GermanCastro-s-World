package Estructures;

import Factory.AbstractFactory;
import Races.Races;

public class FactoryEstructures implements AbstractFactory {
    @Override
    public Estructures getEstructures(String type){
        switch(type){
            case "survarmy":
                return new SurvivorsArmy();
            case "callcenter":
                return new CallCenter();
            case "energydrinks":
                return new EnergyDrinks();
            case "anarmy":
                return new AndroidsArmy();
            case "biocommance":
                return new BioCommance();
            case "offset":
                return new OffsetPresses();
            case "alarmy":
                return new AliensArmy();
            case "loot":
                return new Loot();
            case "solarenergy":
                return new SolarEnergy();
            case "comienzo":
                break;
        }
        return null;
    }
    @Override
    public Races getRaces(String type){
        return null;
    }
}
