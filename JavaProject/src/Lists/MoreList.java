package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "Apple", "Oranges", "Pizza", "Milk" };

		List<String> list = List.of(items);
		System.out.println(list);
		System.out.println(list.getClass().getName());

		ArrayList<String> groceries = new ArrayList<>(list);
		System.out.println(groceries);
		groceries.add("Yogurt");
		System.out.println(groceries);

		ArrayList<String> dog = new ArrayList<>(List.of("Labrador", "Jack Russle", "Pug"));
		System.out.println(dog);
		dog.add("King Charles");
		System.out.println(dog);

		System.out.println(dog.size());

		System.out.println(dog.contains("Pug"));

		System.out.println(dog.indexOf("Pug"));

		System.out.println(dog.remove(0));
		System.out.println(dog);
		dog.clear();

		dog.addAll(Arrays.asList("King Charles", "Labrador", "Jack Russle", "Pug"));
		System.out.println(dog.size());

		dog.sort(Comparator.naturalOrder());
		System.out.println(dog);

		dog.sort(Comparator.reverseOrder());
		System.out.println(dog);

	}

}
