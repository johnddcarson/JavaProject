package ImmutableClasses;

public class Main {

	public static void main(String[] args) {

		Person jane = new Person("Jane", "05/02/1995");
		Person heather = new Person("Heather", "05/01/1995");

		Person[] johnsKids = { jane, heather };

		Person john = new Person("John", "01/03/1970", johnsKids);

		System.out.println(john);

		System.out.println();

		Person[] kids = john.getKids();

		for (var kid : kids) {
			System.out.println(kid.getName());
		}

	}

}
