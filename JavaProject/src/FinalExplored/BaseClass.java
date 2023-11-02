package FinalExplored;

public class BaseClass {

	public final void recommendedMethod() {

		System.out.println("BaseClass.recommendedMethod");
		optionalMethod();
		mandatoryMethod();
	}

	protected void optionalMethod() {

		System.out.println("BaseClass.optionalMethod");
	}

	private void mandatoryMethod() {

		System.out.println("BaseClass.mandatoryMethod *MUST BE RAN*");
	}

	public static void recommendedStatic() {
		System.out.println("recommendedStatic BEST WAY TO DO IT");
		optionalStatic();
		mandatoryStatic();
	}

	protected static void optionalStatic() {
		System.out.println("optionalStatic Optional");
	}

	private static void mandatoryStatic() {
		System.out.println("mandatoryStatic Mandatory");
	}

}
