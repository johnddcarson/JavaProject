package Interface;

public class Truck implements Trackable {

	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " tracked via GPS");

	}

	@Override
	public double milesToKM(double miles) {
		// TODO Auto-generated method stub
		return 0;
	}

}
