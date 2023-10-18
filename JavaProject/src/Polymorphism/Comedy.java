package Polymorphism;

public class Comedy extends Movie {

	public Comedy(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.println("Run via Comedy");
	}

}
