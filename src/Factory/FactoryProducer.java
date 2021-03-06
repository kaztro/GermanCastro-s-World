package Factory;

import Estructures.Army.ArmyFactory;
import Estructures.Energy.EnergyFactory;
import Estructures.Materials.MaterialsFactory;
import Estructures.Proletariat.FactoryStructures;
import Estructures.Vehicles.VehiclesFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type) {
            case "proletariat":
                return new FactoryStructures();
            case "army":
                return new ArmyFactory();
            case "energy":
                return new EnergyFactory();
            case "vehicles":
                return new VehiclesFactory();
            case "materials":
                return new MaterialsFactory();
        }
        return null;
    }
}
