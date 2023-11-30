package A1;

public abstract class Vehicle {

	abstract void printHello();

}

interface Driveable {
}

class Car extends Vehicle implements Driveable {

	@Override
	void printHello() {
		System.out.println("Hello");

	}
}

class SUV extends Car {

}
