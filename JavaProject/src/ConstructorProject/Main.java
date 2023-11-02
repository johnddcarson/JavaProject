package ConstructorProject;

public class Main {

	public static void main(String[] args) {

		Parent parent = new Parent("John", null, 2);
		Child child = new Child();

		System.out.println("Parent " + parent);
		System.out.println("Child " + child);

	}

}
