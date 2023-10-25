package InterfaceChallenge;

enum UtilityType {
	ELECTRICAL, FIBER_OPTIC, GAS, WATER
}

public class UtilityLine implements Mappable {

	private String name;
	private UtilityType type;

	public UtilityLine(String name, UtilityType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String getlable() {
		return name + " (" + type + ")" + " " + getClass().getSimpleName() + " |";
	}

	@Override
	public Geometry getShape() {
		return switch (name) {
		case "College St" -> Geometry.POLYGON;
		case "LINE Olympic Blvd" -> Geometry.DEFAULT;
		default -> Geometry.DEFAULT;
		};
	}

	@Override
	public String getMarker() {
		return switch (type) {
		case ELECTRICAL -> Colour.RED + " " + LineMarker.DASHED;
		case FIBER_OPTIC -> Colour.GREEN + " " + LineMarker.DOTTED;
		case GAS -> Colour.ORANGE + " " + LineMarker.SOLID;
		case WATER -> Colour.BLUE + " " + LineMarker.SOLID;
		default -> Colour.BLACK + " " + LineMarker.SOLID;
		};
	}

	@Override
	public int getSizeOfBuilding() {
		return 0;
	}

	@Override
	public String printOut() {
		// TODO Auto-generated method stub
		return Mappable.super.printOut() + " These building have a size " + getSizeOfBuilding();
	}

}
