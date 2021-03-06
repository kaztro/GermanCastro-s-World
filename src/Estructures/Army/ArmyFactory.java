package Estructures.Army;

import Estructures.Energy.Energy;
import Estructures.Materials.Materials;
import Estructures.Proletariat.Structures;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;

public class ArmyFactory implements AbstractFactory {
    @Override
    public Army getArmy(String type) {
        switch (type) {
            case "aliensarmy":
                return new AliensArmy();
            case "androidsarmy":
                return new AndroidsArmy();
            case "survivorsarmy":
                return new SurvivorsArmy();
        }
        return null;
    }

    @Override
    public Energy getEnergy(String type) {
        return null;
    }

    @Override
    public Structures getEstructures(String type) {
        return null;
    }

    @Override
    public Vehicles getVehicles(String type) {
        return null;
    }

    @Override
    public Materials getMaterials(String type) {
        return null;
    }
}
