package Factory;

import Estructures.Estructures;

public interface AbstractFactory {
    Estructures getEstructures(String type);
}
