package Estructures.Materials;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Proletariat.Estructures;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;

public class MaterialsFactory implements AbstractFactory {

    @Override
    public Materials getMaterials(String type) {
        switch (type) {
            case "aliensmaterials":
                return new AliensMaterials();
            case "androidsmaterials":
                return new AndroidsMaterials();
            case "survivorsmaterials":
                return new SurvivorsMaterials();
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
    public Vehicles getVehicles(String type) {
        return null;
    }

}

