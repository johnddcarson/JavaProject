package Generics;

interface Player {

	int setPlayersNumber();

	default String formatPlayerInfo(String name, String position, int number) {
		return String.format("Team Type: %s Player name: %-15s Position: %s Number: %s", getClass().getSimpleName(),
				name, position, number);
	}

}

record BaseballPlayer(String name, String position) implements Player {

	@Override
	public int setPlayersNumber() {

		return switch (position) {
		case "Right Fielder" -> 10;
		case "Left Fielder" -> 15;
		default -> 0;
		};

	}

	@Override
	public String toString() {
		return formatPlayerInfo(name, position, setPlayersNumber());
	}

}

record FootballerPlayer(String name, String position) implements Player {

	@Override
	public int setPlayersNumber() {
		return switch (position) {
		case "Quarterback" -> 25;
		case "Offensive guard" -> 87;
		default -> 0;
		};

	}

	@Override
	public String toString() {
		return formatPlayerInfo(name, position, setPlayersNumber());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Affiliation cityAffiliation = new Affiliation("Philadelphia");

		Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", cityAffiliation);
		Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros", cityAffiliation);
		scoreResult(phillies, 3, astros, 10);

		var harper = new BaseballPlayer("B Harper", "Right Fielder");
		var marsh = new BaseballPlayer("B Marsh", "Left Fielder");

		phillies.addTeamMember(harper);
		phillies.addTeamMember(marsh);
		phillies.listTeamMembers();

		System.out.println("-".repeat(100));

		Team<FootballerPlayer, Affiliation> cowboys1 = new Team("Dallas Cowboys", cityAffiliation);
		Team<FootballerPlayer, Affiliation> packers1 = new Team("Green Bay Packers", null);
		scoreResult(cowboys1, 3, packers1, 10);

		var prescott = new FootballerPlayer("D. Prescott", "Quarterback");
		var rodgers = new FootballerPlayer("A. Rodgers", "Quarterback");
		var carson = new FootballerPlayer("G. Carson", "Offensive guard");

		cowboys1.addTeamMember(prescott);
		cowboys1.addTeamMember(rodgers);
		cowboys1.listTeamMembers();

		System.out.println("-".repeat(100));

		packers1.addTeamMember(carson);
		packers1.listTeamMembers();

		System.out.println("-".repeat(100));

		Team<BaseballPlayer, String> ballymenaTeam = new Team<>("Ballymena Blues", "Ballymena");
		ballymenaTeam.addTeamMember(harper);
		ballymenaTeam.listTeamMembers();

	}

	public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {

		String message = team1.setScore(t1_score, t2_score);
		team2.setScore(t2_score, t1_score);
		System.out.printf("%s %s %s %n", team1, message, team2);
	}

}
