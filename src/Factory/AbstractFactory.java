package Factory;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Materials.Materials;
import Estructures.Proletariat.Structures;
import Estructures.Vehicles.Vehicles;

public interface AbstractFactory {
    Army getArmy(String type);
    Energy getEnergy(String type);

    Structures getEstructures(String type);
    Vehicles getVehicles(String type);
    Materials getMaterials(String type);
}
