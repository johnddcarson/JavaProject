package NestedClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethod {

	public static void main(String[] args) {

		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(new StoreEmployee("Meg", "Target"),
				new StoreEmployee("Joe", "Walmart"), new StoreEmployee("Tom", "Macys"),
				new StoreEmployee("Marty", "Walmart"), new StoreEmployee("Bud", "Target")));

		var c0 = new EmployeeComparator<StoreEmployee>();
		var c1 = new Employee.EmployeeComparator<StoreEmployee>();
		var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

		// Using local class
		class NameSort<T> implements Comparator<StoreEmployee> {

			@Override
			public int compare(StoreEmployee o1, StoreEmployee o2) {
				return o1.getNameString().compareTo(o2.getNameString());
			}
		}

		var c3 = new NameSort<StoreEmployee>();

		// Using anonymous class
		var c4 = new Comparator<StoreEmployee>() {
			@Override
			public int compare(StoreEmployee o1, StoreEmployee o2) {
				return o1.getNameString().compareTo(o2.getNameString());
			}
		};

		sortIt(storeEmployees, c0);
		// sortIt(storeEmployees, c1);
		sortIt(storeEmployees, c2);
		sortIt(storeEmployees, c3);
		sortIt(storeEmployees, c4);
		sortIt(storeEmployees, (o1, o2) -> o1.getNameString().compareTo(o2.getNameString()));
	}

	public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {

		System.out.println("Sorting with Comparator: " + comparator.toString());
		list.sort(comparator);
		for (var employee : list) {
			System.out.println(employee);
		}
		System.out.println();
	}
}
