package extends1.ext3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.openDoor();
        gasCar.move();
        gasCar.fillup();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.openDoor();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
    }
}
