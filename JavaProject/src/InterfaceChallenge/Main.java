package InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Mappable> mappables = new ArrayList<Mappable>();

		mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
		mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
		mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

		mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
		mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

		for (var building : mappables) {
			Mappable.mapIt(building);
			System.out.println(building.getSizeOfBuilding());
			System.out.println("-".repeat(100));
		}

	}

}
