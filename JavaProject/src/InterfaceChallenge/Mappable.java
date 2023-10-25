package InterfaceChallenge;

enum Geometry {
	LINE, POINT, POLYGON, DEFAULT
}

enum Colour {
	RED, GREEN, BLUE, YELLOW, PURPLE, ORANGE, BLACK
}

enum PointMarker {
	CIRCLE, SQUARE, TRIANGLE, DIAMOND, STAR, PUSH_PIN
}

enum LineMarker {
	SOLID, DASHED, DOTTED, DOUBLE, WAVE
}

public interface Mappable {

	static void mapIt(Mappable mappable) {
		System.out.println((mappable.printOut()));

	}

	String getlable();

	String getMarker();

	Geometry getShape();

	int getSizeOfBuilding();

	default String printOut() {

		return getShape() + " " + getlable() + " " + getMarker();
	}

}
