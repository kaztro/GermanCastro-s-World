package Estructures.Proletariat;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Materials.Materials;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;


public class FactoryStructures implements AbstractFactory {
    @Override
    public Structures getEstructures(String type) {
        switch (type) {
            case "callcenter":
                return new CallCenter();
            case "offset":
                return new OffsetPresses();
            case "loot":
                return new Loot();
        }
        return null;
    }

    @Override
    public Army getArmy(String type) {
        return null;
    }

    @Override
    public Energy getEnergy(String type) {
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

