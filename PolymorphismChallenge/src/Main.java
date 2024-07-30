public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 10.5, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
