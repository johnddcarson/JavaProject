package Interface;

public class Main {

	public static void main(String[] args) {

		Bird bird = new Bird();
		Animals animals = bird;
		FlightEnabled flier = bird;
		// Trackable tracked = bird;

		System.out.println(bird);

		inFlight(bird);

		Jet F15 = new Jet();
		inFlight(F15);

		Trackable tuck = new Truck();
		Truck tuck2 = new Truck();
		System.out.println("-".repeat(50));
		tuck.track();
		System.out.println("-".repeat(50));
		tuck2.track();

		System.out.println(bird.milesToKM(10));

		Satellite satellite = new Satellite();
		System.out.println(satellite.transition(FlightStages.LAUNCH));

		OrbitEarth.log("Testing");
	}

	private static void inFlight(FlightEnabled fly) {
		System.out.println("-".repeat(50));
		fly.takeOff();
		fly.fly();
		if (fly instanceof Trackable tacked) {
			tacked.track();
		}
		fly.land();
	}

}
