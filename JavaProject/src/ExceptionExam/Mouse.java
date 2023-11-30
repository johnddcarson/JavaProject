package ExceptionExam;

import java.io.IOException;

public class Mouse {
	public String name;

	public void run() {
		System.out.print("1");
		try {
			System.out.print("2");
			name.toString();
			System.out.print("3");
		} catch (NullPointerException e) {
			System.out.print("4");
			throw e;
		}
		System.out.print("5");
	}

	public void ohNo() throws IOException {
		throw new java.io.IOException();
	}

	public static void main(String[] args) {
		// Mouse jerry = new Mouse();
		// jerry.run();
		// System.out.print("6");
		String condition = "i";
		System.out.print("a");
		try {
			System.out.print("b");
			if (condition.equals("i")) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.print("c");
		} finally {
			System.out.print("e");

		}

	}
}