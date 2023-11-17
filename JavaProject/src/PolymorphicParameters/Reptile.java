package PolymorphicParameters;

public class Reptile {

	protected String name;
	protected int age;

	protected String getName() {

		if (name == null) {
			return getClass().getSimpleName();
		} else {
			return name;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void feed(Reptile rep) {

		String subclass = rep.getClass().getSimpleName();

		switch (subclass) {
		case "Alligator":
			System.out.println("Feeding Alligator reptile: Name: " + rep.getName());
			break;
		case "Crocodile":
			System.out.println("Feeding Crocodile reptile: Name: " + rep.getName());
			break;
		default:
			System.out.println("Feeding reptile: Name: " + rep.getName());

		}

	}

}
