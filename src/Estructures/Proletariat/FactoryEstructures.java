package Estructures.Proletariat;

import Estructures.Army.AliensArmy;
import Estructures.Army.AndroidsArmy;
import Estructures.Army.SurvivorsArmy;
import Estructures.Energy.BioCommance;
import Estructures.Energy.EnergyDrinks;
import Estructures.Energy.SolarEnergy;
import Estructures.Proletariat.CallCenter;
import Estructures.Proletariat.Estructures;
import Estructures.Proletariat.Loot;
import Estructures.Proletariat.OffsetPresses;
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
}

