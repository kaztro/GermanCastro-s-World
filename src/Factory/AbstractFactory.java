package Factory;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Proletariat.Estructures;
import Estructures.Vehicles.Vehicles;

public interface AbstractFactory {
    Army getArmy(String type);
    Energy getEnergy(String type);
    Estructures getEstructures(String type);
    Vehicles getVehicles(String type);
}
