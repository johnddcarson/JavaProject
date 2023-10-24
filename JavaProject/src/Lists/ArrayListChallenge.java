package Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

	public static void main(String[] args) {

		ArrayList<String> groceryList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Display the menu
			System.out.println("Menu:");
			System.out.println("0 - Exit");
			System.out.println("1 - Option 1 Add Item to list");
			System.out.println("2 - Option 2 Remove item from list");
			System.out.print("Enter your choice (0, 1, or 2): ");

			// Read the user's choice
			int choice = scanner.nextInt();

			// Process the user's choice
			switch (choice) {
			case 0 -> {
				System.out.println("Exiting the program.");
				if (!groceryList.isEmpty()) {
					printGroceryList(groceryList);
				}
				scanner.close(); // Close the scanner before exiting
				System.exit(0);
			}
			case 1 -> {
				System.out.println("You selected Option 1.");
				System.out.println("What item would you like to add?");
				String addItem = scanner.next();
				addGroceryItem(groceryList, addItem);

			}
			case 2 -> {
				System.out.println("You selected Option 2.");
				System.out.println("What item would you like to remove?");
				String removeItem = scanner.next();
				removeGroceryItem(groceryList, removeItem);
			}
			default -> System.out.println("Invalid choice. Please select 0, 1, or 2.");
			}

		}

	}

	public static void addGroceryItem(ArrayList<String> groceryList, String groceryItem) {

		if (groceryList.contains(groceryItem)) {
			System.out.println("Item already added to list");
		} else {
			groceryList.add(groceryItem);
		}

	}

	public static void printGroceryList(ArrayList<String> groceryList) {

		groceryList.sort(Comparator.naturalOrder());
		System.out.println(groceryList);

	}

	public static void removeGroceryItem(ArrayList<String> groceryList, String groceryItem) {

		if (groceryList.contains(groceryItem)) {
			groceryList.remove(groceryItem);
		} else {
			System.out.println("Item not on list");
		}

	}

}
