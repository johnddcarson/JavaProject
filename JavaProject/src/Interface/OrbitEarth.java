package Interface;

interface OrbitEarth extends FlightEnabled {

	void achieveOrbit();

	static void log(String descr) {
		var today = new java.util.Date();
		System.out.println(today + " | " + descr);
	}

}