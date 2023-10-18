package Polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Movie movie = Movie.getMovie("Adventure", "Fast and Furious");
		movie.watchMovie();
		System.out.println();

		Movie movie2 = Movie.getMovie("x", "War Lord");
		movie2.watchMovie();
		System.out.println();

		/*
		 * Adventure adventureMovie = new Adventure("Fast and Furious");
		 * adventureMovie.watchMovie(); System.out.println();
		 */

		Comedy comedyMovie = new Comedy("How to lose a guy in 10 days");
		comedyMovie.watchMovie();
		System.out.println();

		SciFi sciFiMovie = new SciFi("Star Trek");
		sciFiMovie.watchMovie();
		System.out.println();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("What movie Genre would you like to enter?");
			String movieGenre = sc.nextLine();
			if (movieGenre.isBlank()) {
				System.out.println("Data entry completed!");
				break;

			}

			System.out.println("What is the title of the Movie?");
			String movieTitle = sc.nextLine();

			Movie movie3 = Movie.getMovie(movieGenre, movieTitle);
			movie3.watchMovie();
			System.out.println();

		}

	}

}
