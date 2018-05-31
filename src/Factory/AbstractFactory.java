package Factory;

import Estructures.Estructures;
import Races.Races;

public interface AbstractFactory {
    Estructures getEstructures(String type);
    Races getRaces(String type);

}
