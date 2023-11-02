package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// Create a Map (HashMap is one of the commonly used implementations)
		Map<String, String> studentScores = new HashMap<>();

		// Add key-value pairs to the map
		studentScores.put("Alice", "95");
		studentScores.put("Bob", "87");
		studentScores.put("Charlie", "78");
		studentScores.put("Emily", "92");
		studentScores.put("Emily", "92");

		// Access values using keys
		String aliceScore = studentScores.get("Alice");
		String bobScore = studentScores.get("Bob");

		System.out.println("Alice's score: " + aliceScore);
		System.out.println("Bob's score: " + bobScore);

		// Check if a key exists in the map
		boolean hasEmily = studentScores.containsKey("Emily");
		System.out.println("Does Emily exist in the map? " + hasEmily);

		// Iterate through the keys and values in the map
		System.out.println("Student scores:");
		for (Entry<String, String> entry : studentScores.entrySet()) {
			String name = entry.getKey();
			String score = entry.getValue();
			System.out.println(name + ": " + score);
		}
		System.out.println("Student scores:");
		studentScores.forEach((k, v) -> System.out.println(k + ": " + v));

		// Remove a key-value pair
		studentScores.remove("Charlie");

		// Check if a key still exists in the map after removal
		boolean hasCharlie = studentScores.containsKey("Charlie");
		System.out.println("Does Charlie exist in the map after removal? " + hasCharlie);

	}

}
