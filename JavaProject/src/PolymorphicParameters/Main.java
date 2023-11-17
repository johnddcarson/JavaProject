package PolymorphicParameters;

public class Main {

	public static void main(String[] args) {

		Alligator alligator = new Alligator();
		Crocodile crocodile = new Crocodile();
		Reptile rep = new Reptile();
		// ZooWorker crocodile2 = new Crocodile();
		alligator.setName("Billy");
		System.out.println(alligator.zooKeeperName("Jermey"));
		crocodile.setName("John");
		alligator.setAge(5);

		alligator.feed(alligator);
		alligator.howManyBirthdays(alligator.age, alligator);

		crocodile.feed(crocodile);
		rep.feed(rep);

		// feed(alligator);
		// feed(crocodile);
		// feed(new Reptile());

	}

}
