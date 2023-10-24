package Enum;

import java.time.Year;

public enum JohnFamily {
	VIVIEN, KEVIN, HEATHER, KATRINA;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " their age is " + getAge();
	}

	public int getYearBorn() {

		return switch (this) {
		case VIVIEN -> 1964;
		case KEVIN -> 1962;
		case HEATHER -> 1995;
		case KATRINA -> 1993;
		default -> 0;
		};
	}

	public int getAge() {

		int yearBorn = getYearBorn();
		Year currentYear = Year.now();
		int yearValue = currentYear.getValue();

		return yearValue - yearBorn;
	}

}
