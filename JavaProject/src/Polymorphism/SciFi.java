package Polymorphism;

public class SciFi extends Movie {

	public SciFi(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.println("Run via Sci Fi");
	}

}
