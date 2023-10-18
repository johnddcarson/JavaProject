package Polymorphism;

public class NextMain {

	public static void main(String[] args) {

		Movie movie = Movie.getMovie("A", "Jaws");
		movie.watchMovie();

		Adventure jawsAdventure = (Adventure) movie.getMovie("A", "Jaws");
		jawsAdventure.watchMovie();

		System.out.println(jawsAdventure instanceof Adventure);

	}

}
