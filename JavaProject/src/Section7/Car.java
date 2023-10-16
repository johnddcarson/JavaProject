package Section7;

public class Car {

	private String make;
	private String model;
	private String colour;
	private int doors;
	private boolean convertible;

	public Car(String make, String model, String colour, int doors, boolean convertible) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.doors = doors;
		this.convertible = convertible;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public void describeCar() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Colour: " + colour);
		System.out.println("Number of Doors: " + doors);
		System.out.println("Convertible: " + convertible);

	}

	@Override
	public String toString() {
		return "Car make=" + make + ", model=" + model + ", colour=" + colour + ", doors=" + doors + ", convertible="
				+ convertible;
	}

}
