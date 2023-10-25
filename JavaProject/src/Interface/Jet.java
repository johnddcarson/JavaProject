package Interface;

public class Jet implements FlightEnabled, Trackable {

	@Override
	public void takeOff() {
		System.out.println(getClass().getSimpleName() + " is taking off");

	}

	@Override
	public void land() {
		System.out.println(getClass().getSimpleName() + " is landing");

	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + " is flying ");

	}

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + " tracked via GPS");

	}

	@Override
	public double milesToKM(double miles) {
		// TODO Auto-generated method stub
		return miles * KM_TO_MILES;
	}
}
