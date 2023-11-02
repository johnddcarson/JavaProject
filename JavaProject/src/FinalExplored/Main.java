package FinalExplored;

public class Main {

	public static void main(String[] args) {

		BaseClass parent = new BaseClass();
		ChildClass child = new ChildClass();
		BaseClass childRefBase = new ChildClass();

		parent.recommendedMethod();
		printLine();
		child.recommendedMethod();
		printLine();
		childRefBase.recommendedMethod();

		printLine();

		parent.recommendedStatic();
		printLine();
		ChildClass.recommendedStatic();
		printLine();
		childRefBase.recommendedStatic();

	}

	public static void printLine() {
		System.out.println("-".repeat(70));

	}

}
