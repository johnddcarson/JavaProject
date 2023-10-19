package MasterOOPChallenge;

public class Main {

	public static void main(String[] args) {

		/*
		 * Item cokeItem = new Item("drink", "Coke", 2.0); cokeItem.printItem();
		 * cokeItem.setSize("Large"); cokeItem.printItem();
		 * cokeItem.printItem(cokeItem.getName(), cokeItem.getAdjustedPrice());
		 * 
		 * System.out.println(cokeItem.getBasePrice());
		 * System.out.println(cokeItem.getSize());
		 */

		// Burger burger = new Burger("Regular", 4);

		// burger.addToppings("BACON", "cheese", "");

		// burger.printItem();
		// System.out.println(burger.getBasePrice());
		// System.out.println(burger.getAdjustedPrice());

		/*
		 * MealOrder regMealOrder = new MealOrder(); regMealOrder.printItemizedList();
		 */

		MealOrder johnMealOrder = new MealOrder("Regular", "Coke", "Chips");
		johnMealOrder.addBurgerToppings("BACON", "cheese", "");
		johnMealOrder.setDrinkSize("Large");
		johnMealOrder.printItemizedList();

		MealOrder jcMealOrder = new MealOrder("Deluxe", "Coke", "Chips");
		// jcMealOrder.printItemizedList();
		jcMealOrder.addBurgerToppings("BACON", "Cheese", "SALAMI", "AVOCADO", "");
		jcMealOrder.printItemizedList();
		jcMealOrder.setDrinkSize("Large");
		jcMealOrder.printItemizedList();

	}

}
