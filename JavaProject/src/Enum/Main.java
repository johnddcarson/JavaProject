package Enum;

public class Main {

	public static void main(String[] args) {

		JohnFamily family = JohnFamily.KEVIN;

		System.out.println(family);

		System.out.println(family.name() + " " + family.ordinal());

		for (JohnFamily familyMember : JohnFamily.values()) {
			System.out.println(familyMember);

		}

		if (family == JohnFamily.KEVIN) {
			System.err.println("Kevin found");

		} else {
			System.err.println("Kevin not found");
		}

	}

}
