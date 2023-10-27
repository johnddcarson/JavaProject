package InnerClassesBillsBurger;

public class Store {

	public static void main(String[] args) {

		Meal regularMeal = new Meal();
		System.out.println(regularMeal);

		Meal USRegularMeal = new Meal();
		System.out.println(USRegularMeal);
		System.out.println();
		USRegularMeal.addTopping("ONION");
		System.out.println(USRegularMeal);

	}
}
