package InterfaceChallange;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;

	public Player(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public List<String> write() {
		List<String> fieldList = new ArrayList<>();
		fieldList.add(name);
		fieldList.add(weapon);
		fieldList.add(String.valueOf(hitPoints));
		fieldList.add(String.valueOf(strength));

		return fieldList;
	}

	@Override
	public void read(List<String> savedValues) {
		System.out.println("Player [name=" + savedValues.get(0) + ", weapon=" + savedValues.get(1) + ", hitPoints="
				+ savedValues.get(2) + ", strength=" + savedValues.get(3) + "]");

	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", weapon=" + weapon + ", hitPoints=" + hitPoints + ", strength=" + strength
				+ "]";
	}

}
