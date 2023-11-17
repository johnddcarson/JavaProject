package PolymorphicParameters;

public class Crocodile extends Reptile implements ZooKeeper {

	@Override
	public String zooKeeperName(String name) {
		return name;
	}

}
