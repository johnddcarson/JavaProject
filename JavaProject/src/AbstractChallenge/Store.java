package AbstractChallenge;

import java.util.ArrayList;

record OrderItem(int quantityx, ProductForSale productx) {

}

public class Store {

	private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

	public static void main(String[] args) {

		storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
		storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));
		storeProducts.add(new Funiture("Chair", 150, "Big Chair to relax on"));
		storeProducts.add(new Funiture("Sofa", 500, "3 person sofa great to rexal on"));

		listProducts();

		System.out.println("\nOrder 1");
		ArrayList<OrderItem> order1 = new ArrayList<OrderItem>();

		addItemToOrder(order1, 0, 1);
		addItemToOrder(order1, 1, 1);
		addItemToOrder(order1, 2, 2);

		printorder(order1);

		System.out.println("\nOrder 2");
		ArrayList<OrderItem> order2 = new ArrayList<OrderItem>();

		addItemToOrder(order2, 3, 5);
		addItemToOrder(order2, 2, 2);

		printorder(order2);

	}

	public static void listProducts() {

		for (var item : storeProducts) {
			System.out.println("-".repeat(50));
			item.showDetails();
		}
	}

	public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {

		order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
	}

	public static void printorder(ArrayList<OrderItem> order) {

		double salesTotal = 0;
		for (var item : order) {
			item.productx().printPricedItem(item.quantityx());
			salesTotal += item.productx().getSalePrice(item.quantityx());

		}
		System.out.printf("Sales Total = $%6.2f %n", salesTotal);
	}
}
