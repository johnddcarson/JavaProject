package Polymorphism;

public class Adventure extends Movie {

	public Adventure(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		super.watchMovie();
		System.out.println("Run via Adventure");
	}

}
