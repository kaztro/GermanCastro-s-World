package Estructures.Vehicles;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Materials.Materials;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;

public class VehiclesFactory implements AbstractFactory {
    @Override
    public Vehicles getVehicles(String type) {
        switch (type) {
            case "tank":
                return new Tank();
            case "convoy":
                return new Convoy();
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
    public Estructures getEstructures(String type) {
        return null;
    }

    @Override
    public Materials getMaterials(String type) {
        return null;
    }
}
