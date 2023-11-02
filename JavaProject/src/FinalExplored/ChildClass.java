package FinalExplored;

public class ChildClass extends BaseClass {

	@Override
	protected void optionalMethod() {

		super.optionalMethod();
		System.out.println("Extra child stuff happen ");
	}

	public static void recommendedStatic() {
		System.out.println("CHILD recommendedStatic BEST WAY TO DO IT");
		optionalStatic();

	}

}
