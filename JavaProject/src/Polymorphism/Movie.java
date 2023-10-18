package Polymorphism;

public class Movie {

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public static Movie getMovie(String type, String title) {

		return switch (type.toUpperCase().charAt(0)) {
		case 'A' -> new Adventure(title);
		case 'C' -> new Comedy(title);
		case 'S' -> new SciFi(title);
		default -> new Movie(title);
		};

	}

	public void watchMovie() {
		String instanceType = this.getClass().getCanonicalName();
		System.out.println(title + " is a generic " + instanceType + " film");
	}

}
