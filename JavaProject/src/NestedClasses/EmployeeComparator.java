package NestedClasses;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getNameString().compareTo(o2.getNameString());
	}

}
