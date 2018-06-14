package Estructures.Vehicles;

public class AliensVehicles implements Vehicles {
    @Override
    public void GenerateConvoy() {
        System.out.println("We are creating the garage");
    }

    @Override
    public void GenerateTank() {
        System.out.println("We searching more engineers for this wait...");
    }
}
