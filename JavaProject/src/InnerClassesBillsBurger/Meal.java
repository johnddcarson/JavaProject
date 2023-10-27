package InnerClassesBillsBurger;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private double price = 5.0;
	private Burger burger;
	private Item drink;
	private Item side;

	private double conversionRate;

	public Meal() {
		this(1);
	}

	public Meal(double conversionRate) {
		this.conversionRate = conversionRate;
		burger = new Burger("regular");
		drink = new Item("coke", "drink", 1.5);
		System.out.println(drink.name);
		side = new Item("fries", "side", 2.0);
	}

	public double getTotal() {

		double total = burger.getPrice() + drink.price + side.price;
		return Item.getPrice(total, conversionRate);
	}

	@Override
	public String toString() {
		return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
	}

	public void addTopping(String... selectedToppings) {
		burger.addToppings(selectedToppings);

	}

	private class Item {

		private String name;
		private String type;
		private double price;

		public Item(String name, String type) {
			this(name, type, type.equals("burger") ? Meal.this.price : 0);
		}

		public Item(String name, String type, double price) {
			this.name = name;
			this.type = type;
			this.price = price;
		}

		@Override
		public String toString() {
			return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionRate));
		}

		private static double getPrice(double price, double rate) {
			return price * rate;
		}
	}

	private class Burger extends Item {
		private enum BurgerToppingEnum {
			LETTUCE, TOMATO, ONION, PICKLES, CHEESE, BACON, MUSHROOMS, KETCHUP, MUSTARD, MAYONNAISE;

			public double getPriceE() {
				return 0.5;
			}
		}

		private List<Item> topping = new ArrayList<>();

		Burger(String name) {
			super(name, "Burger", 5.0);

		}

		public double getPrice() {

			double total = super.price;
			for (Item topping : topping) {
				total += topping.price;
			}
			return total;
		}

		private void addToppings(String... selectedToppings) {

			for (String selectedxToppings : selectedToppings) {
				BurgerToppingEnum burgerTopping = BurgerToppingEnum.valueOf(selectedxToppings.toUpperCase());
				topping.add(new Item(burgerTopping.name(), "Topping", burgerTopping.getPriceE()));
			}

		}

		@Override
		public String toString() {

			StringBuilder itemized = new StringBuilder(super.toString());
			for (Item topping : topping) {
				itemized.append("\n");
				itemized.append(topping);
			}

			return itemized.toString();
		}

	}

}
