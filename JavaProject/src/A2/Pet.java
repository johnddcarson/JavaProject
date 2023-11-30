package A2;

public class Pet {

	private String name;
	private int age;

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void petDetails() {

		System.out
				.println("The pet type is a " + getClass().getSimpleName() + " Name " + getName() + " Age " + getAge());
	}

}
