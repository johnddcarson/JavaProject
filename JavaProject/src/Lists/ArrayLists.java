package Lists;

import java.util.ArrayList;

record GroceryItem(String nameString, String type, int count) {

	public GroceryItem(String nameString, String type, int count) {
		this.nameString = nameString;
		this.type = type;
		this.count = count;

	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, nameString.toUpperCase(), type.toUpperCase());
	}

}

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		GroceryItem[] groceryArray = new GroceryItem[3];
//		groceryArray[0] = new GroceryItem("Drink", "Milk", 1);
//		System.out.println(Arrays.toString(groceryArray));

		ArrayList<GroceryItem> johnArrayLists = new ArrayList<>();

		johnArrayLists.add(new GroceryItem("Drink", "Milk", 1));
		johnArrayLists.add(0, new GroceryItem("Food", "Pizza", 2));
		johnArrayLists.add(new GroceryItem("Food", "Apple", 10));
		System.out.println(johnArrayLists);
		System.out.println(johnArrayLists.contains("Pizza".toUpperCase()));

	}

}
