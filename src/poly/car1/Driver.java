package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("차 설정"+ car);
        this.car = car;
    }

    public void drive() {
        System.out.println("차 운전");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
