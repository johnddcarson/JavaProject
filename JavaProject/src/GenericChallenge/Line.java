package GenericChallenge;

import java.util.Arrays;

abstract class Line implements Mappable {

	private double[][] locations;

	public Line(String... locations) {
		this.locations = new double[locations.length][];
		int index = 0;
		for (var l : locations) {
			this.locations[index++] = Mappable.stringToLatLon(l);
		}
	}

	@Override
	public void render() {
		System.out.println("Render " + this + " as POINT (" + location() + ")");

	}

	private String location() {
		return Arrays.deepToString(locations);
	}

}
