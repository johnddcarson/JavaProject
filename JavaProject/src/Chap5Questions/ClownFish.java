package Chap5Questions;

public class ClownFish implements Aquatic {

	public String getNumberOfGills() {
		return "4";
	}

	@Override
	public int getNumberOfGills(int input) {
		return 6;
	}

	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumberOfGills(-1));
	}

}
