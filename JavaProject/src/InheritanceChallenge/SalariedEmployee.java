package InheritanceChallenge;

public class SalariedEmployee extends Employee {

	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
		super(name, birthDate, employeeId, hireDate);
		this.annualSalary = annualSalary;
	}

	public void retired() {

		terminate("12/12/2025");
		isRetired = true;
	}

	@Override
	public double collectPay() {
		// Calculate the monthly salary
		double monthlySalary = annualSalary / 12;

		// Round the result to two decimal places
		double roundedMonthlySalary = Math.round(monthlySalary * 100.0) / 100.0;

		return roundedMonthlySalary;
	}

	@Override
	public void displayPayCheque() {

		System.out.println("Monthly Pay cheque = " + collectPay());

	}

}
