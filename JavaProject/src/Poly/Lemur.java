package Poly;

public class Lemur extends Primate implements HasTail {

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();

		Primate primate1 = new Primate();
		// Lemur lemur2 = (Lemur) primate1;
		lemur.setAnimalName("Jason Kelce");
		System.out.println(lemur.age);

		HasTail hasTail = lemur;
		System.out.println("Tail Striped " + hasTail.isTailStriped());

		Primate primate = lemur;
		System.out.println("Has hair " + primate.hasHair());
		System.out.println("Name " + primate.getAnimalName());
		System.out.println(lemur);

		Lemur lemur3 = (Lemur) hasTail;
		System.out.println(lemur3.age);

		Lemur lemur4 = (Lemur) primate;
		System.out.println(lemur4.age);
	}

	@Override
	public boolean isTailStriped() {
		return false;
	}

	@Override
	public String toString() {
		return "Lemur " + getAnimalName() + " age = " + age;
	}

}