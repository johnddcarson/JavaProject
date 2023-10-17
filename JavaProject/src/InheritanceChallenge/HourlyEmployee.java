package InheritanceChallenge;

public class HourlyEmployee extends Employee {

	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
		super(name, birthDate, employeeId, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public double collectPay() {
		// TODO Auto-generated method stub
		return 40 * hourlyPayRate;
	}

	public double getDoublePay() {

		return collectPay() * 2;
	}

	@Override
	public void displayPayCheque() {

		System.out.println("Weekly Pay cheque = " + collectPay());
	}

}
