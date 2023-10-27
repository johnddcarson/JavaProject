package NestedClasses;

import java.util.Comparator;
import java.util.Random;

public class Employee {

	public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

		private String sortType;

		public EmployeeComparator() {
		}

		public EmployeeComparator(String sortType) {
			this.sortType = sortType;
		}

		@Override
		public int compare(Employee o1, Employee o2) {
			if (sortType.equalsIgnoreCase("yearStarted")) {
				return o1.yearStarted - o2.yearStarted;
			}
			return o1.nameString.compareTo(o2.nameString);
		}

	}

	private static int LAST_ID = 1;
	private int employeeId;
	private String nameString;
	private int yearStarted;

	protected static Random random = new Random();

	public Employee(String nameString) {
		employeeId = LAST_ID++;
		this.nameString = nameString;
		this.yearStarted = random.nextInt(2012, 2023);
	}

	public Employee() {
	}

	public String getNameString() {
		return nameString;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", nameString=" + nameString + ", yearStarted=" + yearStarted
				+ "]";
	}

}
