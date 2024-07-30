public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 10.5, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model S", 568, 75);
        runRace(tesla);

        Car innovaZenix = new HybridCar("2022 Silver Toyota Innova Zenix", 12.5, 1, 6);
        runRace(innovaZenix);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
