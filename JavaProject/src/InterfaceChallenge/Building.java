package InterfaceChallenge;

enum UsageType {
	BUSINESS, ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS
}

public class Building implements Mappable {

	private String name;
	private UsageType usage;

	public Building(String name, UsageType usage) {
		this.name = name;
		this.usage = usage;
	}

	@Override
	public String getlable() {
		return name + " (" + usage + ")" + " " + getClass().getSimpleName() + " |";
	}

	@Override
	public String getMarker() {
		return switch (usage) {
		case ENTERTAINMENT -> Colour.GREEN + " " + PointMarker.TRIANGLE;
		case GOVERNMENT -> Colour.RED + " " + PointMarker.STAR;
		case RESIDENTIAL -> Colour.BLUE + " " + PointMarker.SQUARE;
		case SPORTS -> Colour.ORANGE + " " + PointMarker.PUSH_PIN;
		default -> Colour.BLACK + " " + PointMarker.CIRCLE;
		};
	}

	@Override
	public Geometry getShape() {
		return switch (name) {
		case "Sydney Town Hall" -> Geometry.LINE;
		case "Sydney Opera House" -> Geometry.POINT;
		case "Stadium Australia" -> Geometry.POLYGON;
		default -> Geometry.POLYGON;
		};
	}

	@Override
	public String printOut() {
		return Mappable.super.printOut() + "The size of the " + getClass().getSimpleName() + " " + getSizeOfBuilding()
				+ " feet tall";
	}

	@Override
	public int getSizeOfBuilding() {
		return switch (name) {
		case "Sydney Town Hall" -> 100;
		case "Sydney Opera House" -> 200;
		case "Stadium Australia" -> 300;
		default -> 0;
		};
	}

}
