package PolymorphicParameters;

public class Alligator extends Reptile implements ZooKeeper {

	public void howManyBirthdays(int age, Alligator a) {

		for (int i = 0; i <= age; i++) {

			System.out.println(a.name + " has had birthday number " + i);

		}

	}

	@Override
	public String zooKeeperName(String name) {

		return name;
	}

}