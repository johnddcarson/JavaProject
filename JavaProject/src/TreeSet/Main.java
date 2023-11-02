package TreeSet;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Adding elements to the TreeSet
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(7);

		// Elements in a TreeSet are automatically sorted
		// It will be sorted in ascending order
		System.out.println("TreeSet elements: " + treeSet);

		// Removing an element
		treeSet.remove(2);

		// Check if an element exists
		boolean contains = treeSet.contains(5);
		System.out.println("Does TreeSet contain 5? " + contains);

		// Size of the TreeSet
		int size = treeSet.size();
		System.out.println("Size of the TreeSet: " + size);

		System.out.println(treeSet.first());
		System.out.println(treeSet.last());

		// Iterate through the TreeSet
		System.out.println("Iterating through TreeSet:");
		for (Integer element : treeSet) {
			System.out.println(element);
		}
	}
}