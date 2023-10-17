package InheritanceChallenge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {

	private String name;
	private String birthDate;
	protected String endDate;

	public Worker() {

	}

	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate birthLocalDate = LocalDate.parse(birthDate, formatter);
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(birthLocalDate, currentDate);
		return age.getYears();
	}

	public double collectPay() {

		return 0.0;
	}

	public void terminate(String endDate) {
		this.endDate = endDate;

	}

	public void displayPayCheque() {

		System.out.println("");

	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}

}
