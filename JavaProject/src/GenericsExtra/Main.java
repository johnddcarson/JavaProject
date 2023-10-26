package GenericsExtra;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			students.add(new Student());
		}

		printList(students);

		List<LPAStudent> lpaStudents = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lpaStudents.add(new LPAStudent());
		}
		printList(lpaStudents);

		List<BehaviourStudent> behaviourStudents = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			behaviourStudents.add(new BehaviourStudent());
		}

		printList(behaviourStudents);

		testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
		testList(new ArrayList<Integer>(List.of(1, 2, 3)));

	}

	public static void printList(List<? extends Student> students) {

		for (var student : students) {
			System.out.println(student.getYearStarted() + " " + student);
			System.out.println("-".repeat(70));
		}
		Class<?> studentClass = students.get(0).getClass(); // Get the class of the first student
		System.out.println("End of all " + studentClass.getSimpleName());
		System.out.println("-".repeat(70));

	}

	public static void testList(List<?> list) {

		for (var element : list) {
			if (element instanceof String s) {
				System.out.println("String: " + s.toUpperCase());
			} else if (element instanceof Integer i) {
				System.out.println("Integer: " + i.floatValue());
			}
		}
	}

}
