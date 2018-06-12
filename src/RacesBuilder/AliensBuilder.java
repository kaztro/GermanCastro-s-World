package RacesBuilder;

import CommandCenter.CommandCenter;
import CommandCenter.CCDirector;
import CommandCenter.CCBuilder;
import CommandCenter.AliensCC;
import Estructures.Army.Army;
import Estructures.Energy.Energy;
import Estructures.Proletariat.Estructures;
import Estructures.Vehicles.Vehicles;
import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Lists.AliensList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AliensBuilder extends RaceBuilder {
    public AliensBuilder() {super.race = new Race();}

    @Override
    public void buildCommandCenter() {
        CCDirector cc = new CCDirector();
        CCBuilder cca = new AliensCC();
        cc.setCCBuilder(cca);
        cc.buildCommandCenter();

        //CommandCenter commandCenter = cc.getCommandCenter();
    }
    /*
    public void options(){
        System.out.println("Bien hecho, ahora tienes disponible xx de dinero, xx de energia y xx de materiales.");
        System.out.println("Que quieres construir?");
        System.out.println("1. Generador de dinero");
        System.out.println("2. Soldados");
        System.out.println("3. Generador de Energia");
        System.out.println("4. Vehiculos");
    }*//*
    @Override
    public void buildEstructures() {
        AbstractFactory fact1, fact2, fact3, fact4;

        Scanner cin = new Scanner(System.in);

        int obj = 0;

        AliensList estructureList = new AliensList();

        while (obj != 2) {
            options();
            try {

                obj = cin.nextInt();

                switch (obj) {
                    case 1:
                        fact1 = FactoryProducer.getFactory("proletariat");
                        Estructures estructures = fact1.getEstructures("callcenter");
                        estructureList.addEstructures(estructures);
                        break;
                    case 2:
                        fact2 = FactoryProducer.getFactory("army");
                        Army army = fact2.getArmy("aliensarmy");
                        break;
                    case 3:
                        fact3 = FactoryProducer.getFactory("energy");
                        Energy energy = fact3.getEnergy("solarenergy");
                        break;
                    case 4:
                        fact4 = FactoryProducer.getFactory("vehicles");
                        System.out.println("Deseas crear: ");
                        System.out.println("1. Escribe 'convoy' para un Convoy");
                        System.out.println("2. Escribe 'tank' para una tanqueta");
                        String select = cin.nextLine();
                        Vehicles vehicles = fact4.getVehicles(select);
                }
            } catch (InputMismatchException E) {
                System.err.println("The number you've type It's not an Int");
            }
            cin.nextLine();
            //factory = FactoryProducer.getFactory("proletariat");
            //Estructures estructures = factory.getEstructures("callcenter");
        }
    }*/

    @Override
    public void buildTempConstruct() {
        race.setTempConstruct(1);
    }

    @Override
    public void buildCantDamage() {
        race.setCantDamage(20);
    }

}

/*
    @Override
    public Race getRace() {
        return super.getRace();
    }

    @Override
    public void generateRace() {
        super.generateRace();
    }

    @Override
    public void constructCommandCenter() {
        CommandCenter center = new CommandCenter();
        center.setLevel(0);
        center.setLife(100);
        race.setCommandCenter(center);
    }

    @Override
    public void generateEstructures() {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("estructure");
        Estructures estructures = factory.getEstructures("comienzo");
    }

    @Override
    public void setTempConstruct() {
        race.setTempConstruct(1);
    }

    @Override
    public void setCantDamage() {
        race.setCantDamage(20);
    }
*/