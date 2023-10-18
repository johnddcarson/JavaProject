package Polymorphism;

public class MainChallenge1 {

	public static void main(String[] args) {

		Car car = new Car("Big Car!");
		runCarOperation(car);

		Car gasPoweredCar = new GasPoweredCar("Petrol powered car!", 30, 4);
		runCarOperation(gasPoweredCar);

		Car electricCar = new ElectricCar("Electric car!", 30, 100);
		runCarOperation(electricCar);

		Car hybridCar = new HybridCar("HybridCar car has move gas powered and electric engine", 50, 100, 6);
		runCarOperation(hybridCar);

	}

	public static void runCarOperation(Car car) {
		car.startEngine();
		car.drive();
		System.out.println();
	}

}
