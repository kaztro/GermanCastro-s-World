package Estructures.Energy;

import Estructures.Army.Army;
import Estructures.Proletariat.Estructures;
import Factory.AbstractFactory;

public class EnergyFactory implements AbstractFactory {

    @Override
    public Energy getEnery(String type) {
        switch (type) {
            case "biocommance":
                return new BioCommance();
            case "energydrinks":
                return new EnergyDrinks();
            case "solarenergy":
                return new SolarEnergy();
        }
    }

    @Override
    public Army getArmy(String type) {
        return null;
    }

    @Override
    public Estructures getEstructures(String type) {
        return null;
    }
}
