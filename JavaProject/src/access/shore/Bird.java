package access.shore;

public class Bird {

	protected String text = "floating"; // protected access
	public static String textStatic = "Hello";

	protected void floatInWater() { // protected access
		System.out.println(text);

	}
}
