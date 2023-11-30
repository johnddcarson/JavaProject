package Exception;

public abstract class Animal {

	abstract int legs(int numberOfLegs) throws Exception;

	abstract int legs2(int numberOfLegs);

	public static void main(String[] args) {

		System.out.println("Hello " + args.length + " " + args[1]);

	}

}
