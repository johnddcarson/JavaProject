package Polymorphism;

public class Car {

	private String description;

	public Car(String description) {
		this.description = description;
	}

	public void startEngine() {

		String instanceType = this.getClass().getSimpleName();

		System.out.println(instanceType + " Engine has started and the description is " + description);

	}

	public void drive() {

		String instanceType = this.getClass().getSimpleName();
		System.out.println("Car is driving " + instanceType);
		runEngine();
	}

	protected void runEngine() {

		System.out.println("Run Engine");

	}

}

class GasPoweredCar extends Car {

	private double avgKmPerLitre;
	private int cylinders;

	public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("it has a " + cylinders + " cylinder engine");
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println("The gas powered car is driving and has an average MPG of  " + avgKmPerLitre);
	}

}

class ElectricCar extends Car {

	private double avgKmPerCharge;
	private int batterySize;

	public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("Electric Car the battery size is " + batterySize);
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println("Electric Car");
	}

}

class HybridCar extends Car {

	private double avgKmPerLitre;
	private int batterySize;
	private int cylinders;

	public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("Hybrid Car has a battery size of " + batterySize + " and MPG of " + avgKmPerLitre);
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println("Hybrid Car");
	}

}
