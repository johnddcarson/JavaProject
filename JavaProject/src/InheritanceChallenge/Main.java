package InheritanceChallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee tim = new Employee("Tim", "1985-01-15", 77001, "01/01/2020");

		System.out.println(tim);
		System.out.println("Age = " + tim.getAge());
		System.out.println("Pay = " + tim.collectPay());

		System.out.println();
		SalariedEmployee john = new SalariedEmployee("john", "1995-01-15", 77002, "01/01/2020", 50000);

		System.out.println(john);
		System.out.println("Age = " + john.getAge());
		john.displayPayCheque();
		System.out.println();

		HourlyEmployee jack = new HourlyEmployee("jack", "1995-01-15", 77002, "01/01/2020", 25);

		System.out.println(jack);
		System.out.println("Age = " + jack.getAge());
		jack.displayPayCheque();
		System.out.println("Holiday pay " + jack.getDoublePay());

		String textBlock = """
				\nPrint a Bulleted List:
				\u2022 First Point
					\u2022 Sub Point""";

		System.out.println(textBlock);

		int age = 35;

		System.out.printf("\nYour age is %2d" + " years old\n", age);

		String name = "John";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		System.out.println(name.contains("J"));
		System.out.println(name.equalsIgnoreCase("joHN"));
		System.out.println(name.startsWith("Jo"));
		System.out.println(name.indexOf("J", 1));
		System.out.println();

		System.out.println(name.toUpperCase());

		System.out.println(name.strip().toLowerCase());

		System.out.println(name.substring(0, 2).toUpperCase());

		System.out.println(name.replace("J", "K"));
	}

}
