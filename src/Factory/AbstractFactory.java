package Factory;

import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Proletariat.Estructures;

public interface AbstractFactory {
    Army getArmy(String type);

    Energy getEnery(String type);
    Estructures getEstructures(String type);
}
