package A3;

public class Gorilla extends Animal {

	String nameString;
	String sizeString;

	public Gorilla(int age, String nameString, String sizeString) {
		super(age);
		this.nameString = nameString;
		this.sizeString = sizeString;
	}

	public Gorilla(int age, String nameString) {
		this(age, nameString, "DefaultSize");
	}

	public Gorilla(int age) {
		this(age, "Jim", "Large");
	}

	public Gorilla(String sizeString) {
		this(10, "Rooof");
		this.sizeString = sizeString;
	}

	@Override
	public String toString() {
		return "Gorilla [nameString=" + nameString + ", sizeString=" + sizeString + "] " + this.sizeString + " "
				+ super.age;
	}

	@Override
	public void print() {
		System.out.println("Print Child");
	}

	@Override
	protected void Helper() {
		System.out.println("Helper");

	}

	@Override
	public void swim5Km() {
		System.out.println("YES Swim");

	}

}