package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	record Person(String firstName, String LastName) {

		@Override
		public String toString() {
			return firstName + " " + LastName;
		}

	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>(
				Arrays.asList(new Person("John", "Carson"), new Person("Heather", "Zarson"),
						new Person("Alice", "Smith"), new Person("Grace", "Davis"), new Person("Aatrina", "Carson")));

		System.out.println(people);

		/*
		 * people.sort(new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO Auto-generated
		 * method stub return o1.LastName.compareTo(o2.LastName); } });
		 */
		people.sort((o1, o2) -> o1.LastName.compareTo(o2.LastName));

		System.out.println(people);

		interface EnhancedComparartor<T> extends Comparator<T> {

			int secondLevel(T o1, T o2);
		}
		var comparatorMixed = new EnhancedComparartor<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				int result = o1.LastName().compareTo(o2.LastName());
				return (result == 0 ? secondLevel(o1, o2) : result);
			}

			@Override
			public int secondLevel(Person o1, Person o2) {
				return o1.firstName().compareTo(o2.firstName());
			}

		};

		people.sort(comparatorMixed);
		System.out.println(people);

	}

}
