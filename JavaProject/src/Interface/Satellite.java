package Interface;

enum FlightStages implements Trackable {
	GROUNDED, LAUNCH, CRUISE;

	@Override
	public void track() {
		if (this != GROUNDED) {
			System.out.println("Monitoring " + this);
		}

	}

	@Override
	public double milesToKM(double miles) {
		// TODO Auto-generated method stub
		return 0;
	}
}

record DrangonFly(String name, String type) implements FlightEnabled {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}

public class Satellite implements OrbitEarth {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void achieveOrbit() {
		// TODO Auto-generated method stub

	}

	@Override
	public FlightStages transition(FlightStages stage) {
		// TODO Auto-generated method stub
		return stage;
	}

}
