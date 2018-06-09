package Estructures.Proletariat;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;


public class FactoryEstructures implements AbstractFactory {
    @Override
    public Estructures getEstructures(String type) {
        switch (type) {
            case "callcenter":
                return new CallCenter();
            case "offset":
                return new OffsetPresses();
            case "loot":
                return new Loot();
            case "comienzo":
                break;
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
}

