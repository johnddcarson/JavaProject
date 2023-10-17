package Inheritance;

public class Fish extends Animal {

	private int gills;
	private int fins;

	public Fish(String type, double weight, int gills, int fins) {
		super(type, "Tiny", weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscles() {
		System.out.println("Muscles moving");
	}

	private void moveBackFin() {
		System.out.println("Backfin moving");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Humans can't hear the sound a fish makes");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		moveMuscles();
		moveBackFin();
		System.out.println();
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + ", toString()=" + super.toString() + "]";
	}

}
