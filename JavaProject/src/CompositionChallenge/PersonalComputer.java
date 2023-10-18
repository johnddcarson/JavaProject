package CompositionChallenge;

public class PersonalComputer extends Product {

	private ComputerCase computerCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
			Motherboard motherboard) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	private void drawLogo() {
		monitor.drawPixalAt(1200, 50, "Yellow");
	}

	private void powerUp() {
		computerCase.pressPowerButton();
	}

	public void startPC(String program) {
		powerUp();
		drawLogo();
		motherboard.loadProgram(program);
	}

}
