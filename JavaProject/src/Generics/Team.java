package Generics;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name) {

	@Override
	public String toString() {
		return name;
	}

}

public class Team<T extends Player, S> {

	private String teamName;
	private List<T> teamMembers = new ArrayList<>();
	private int totalWins = 0;
	private int totalLoss = 0;
	private int totalTies = 0;

	private S affiliationn;

	public Team(String teamName, S affiliationn) {
		this.teamName = teamName;
		this.affiliationn = affiliationn;
	}

	public void addTeamMember(T t) {

		if (!teamMembers.contains(t)) {
			teamMembers.add(t);
		}
	}

	public void listTeamMembers() {

		System.out.print(teamName + " Roaster:");
		System.out.println((affiliationn == null ? " " : " Affiliationn " + affiliationn));

		for (var teamlist : teamMembers) {
			System.out.println(teamlist);
		}

	}

	public int ranking() {
		return (totalLoss * 2) + totalTies + 1;
	}

	public String setScore(int ourScore, int theirScore) {

		String message = "lost to";
		if (ourScore > theirScore) {
			totalWins++;
			message = "beat";
		} else if (ourScore == theirScore) {
			totalTies++;
			message = "tied";
		} else {
			totalLoss++;
		}

		return message;

	}

	@Override
	public String toString() {
		return teamName + " (Ranked " + ranking() + ")";
	}

}
