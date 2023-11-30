package OnlineQuestions;

class Car2 extends Vehicle2 {

	String trans;

	public Car2(String trans) {
		super();
		this.trans = trans;
	}

	public Car2(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans;
	}

	private void init() {
		System.out.println("Intitalized");
	}

}