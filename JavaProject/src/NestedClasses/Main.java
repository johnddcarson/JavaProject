package NestedClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>(
				List.of(new Employee("John"), new Employee("Jack"), new Employee("Heather"), new Employee("Amy")));

		// var comparator = new EmployeeComparator<>();
		// employees.sort(comparator);

		employees.sort(new Employee.EmployeeComparator<>("yearStarted"));

		for (var e : employees) {
			System.out.println(e);
		}

		System.out.println("Store Members");

		List<StoreEmployee> storeEmployees = new ArrayList<>(
				List.of(new StoreEmployee("Jason", "Spar"), new StoreEmployee("Jack", "BBQ"),
						new StoreEmployee("Shannon", "Tesco"), new StoreEmployee("Phil", "Pauls Store")));

		var genEmployee = new StoreEmployee();
		var comparator = genEmployee.new StoreComparator<>();
		storeEmployees.sort(comparator);

		for (StoreEmployee storeEmployee : storeEmployees) {

			System.out.println(storeEmployee);

		}

		System.out.println("-".repeat(150));

		System.out.println("With Pig Latin Names");
		addPigLatinName(storeEmployees);

	}

	public static void addPigLatinName(List<? extends StoreEmployee> list) {

		String lastName = "Piggy";

		class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {

			private String pigLatinName;
			private Employee originalInstance;

			public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
				this.pigLatinName = pigLatinName + " " + lastName;
				this.originalInstance = originalInstance;
			}

			@Override
			public String toString() {
				return originalInstance.toString() + " " + pigLatinName;
			}

			@Override
			public int compareTo(DecoratedEmployee o) {
				return pigLatinName.compareTo(o.pigLatinName);
			}
		}

		List<DecoratedEmployee> newList = new ArrayList<>(list.size());

		for (var employee : list) {
			String name = employee.getNameString();
			String pigLatin = name.substring(1) + name.charAt(0) + "ay";
			newList.add(new DecoratedEmployee(pigLatin, employee));
		}

		newList.sort(null);
		for (var dEmployee : newList) {
			System.out.println(dEmployee.originalInstance.getNameString() + " " + dEmployee.pigLatinName);
		}

	}

}
