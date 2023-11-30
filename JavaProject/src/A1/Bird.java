package A1;

public class Bird {

	public static int count = 0;

	protected String text = "floating"; // protected access

	protected void floatInWater() { // protected access
		System.out.println(text);
	}
}