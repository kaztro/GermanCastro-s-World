package Estructures.Energy;

import Estructures.Army.Army;
import Estructures.Proletariat.Estructures;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;

public class EnergyFactory implements AbstractFactory {

    @Override
    public Energy getEnergy(String type) {
        switch (type) {
            case "biocommance":
                return new BioCommance();
            case "energydrinks":
                return new EnergyDrinks();
            case "solarenergy":
                return new SolarEnergy();
            case "comienzo":
                break;
        }
        return null;
    }

    @Override
    public Army getArmy(String type) {
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
