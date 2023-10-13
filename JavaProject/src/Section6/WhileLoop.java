package Section6;

public class WhileLoop {

	public static void main(String[] args) {

		int number = 5;
		int eventNumberFound = 0;

		while (number <= 20) {

			if(eventNumberFound ==5) {
				break;
				
			}
			if (isEvenNumber(number)) {
				System.out.println(number);
				eventNumberFound++;
			}
			number++;
		}

	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}

}