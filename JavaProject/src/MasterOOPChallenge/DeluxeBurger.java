package MasterOOPChallenge;

public class DeluxeBurger extends Burger {

	private Item deluxe1;
	private Item deluxe2;

	public DeluxeBurger(String name, double price) {
		super(name, price);

	}

	public void addToppings(String extra1, String extra2, String extra3, String deluxe1, String deluxe2) {
		// TODO Auto-generated method stub
		super.addToppings(extra1, extra2, extra3);
		if (!deluxe1.isEmpty()) {
			this.deluxe1 = new Item("TOPPING " + deluxe1, deluxe1, 0);
		}
		if (!deluxe2.isEmpty()) {
			this.deluxe2 = new Item("TOPPING " + deluxe2, deluxe2, 0);
		}

	}

	@Override
	public void printItemizedList() {
		// TODO Auto-generated method stub
		super.printItemizedList();
		if (deluxe1 != null) {
			deluxe1.printItem();
		}
		if (deluxe2 != null) {
			deluxe2.printItem();
		}
	}

	@Override
	public double getExtraPrice(String toppingName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
