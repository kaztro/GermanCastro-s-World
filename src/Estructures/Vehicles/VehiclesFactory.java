package Estructures.Vehicles;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Materials.Materials;
import Estructures.Proletariat.Structures;
import Factory.AbstractFactory;

public class VehiclesFactory implements AbstractFactory {
    @Override
    public Vehicles getVehicles(String type) {
        switch (type) {
            case "aliensvehicles":
                return new AliensVehicles();
            case "survivorsvehicles":
                return new SurvivorsVehicles();
            case "androidsvehicles":
                return new AndroidsVehicles();
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
    public Structures getEstructures(String type) {
        return null;
    }

    @Override
    public Materials getMaterials(String type) {
        return null;
    }
}
