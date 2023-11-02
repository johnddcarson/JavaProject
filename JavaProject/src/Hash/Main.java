package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<String> boyNames = new HashSet<>();
		Set<String> boyNames2 = new HashSet<>();

		boyNames.addAll(Arrays.asList("John", "Jack", "James"));
		boyNames2.addAll(Arrays.asList("John", "Jack", "James", "Peter", "Roma", "Tiernan"));
		boyNames.forEach(System.out::println);
		System.out.println();
		boyNames2.forEach(System.out::println);

		Set<String> uniboyNames = new HashSet<>();
		System.out.println();
		uniboyNames.addAll(boyNames);
		uniboyNames.addAll(boyNames2);
		uniboyNames.forEach(System.out::println);

		Set<String> retainNames = new HashSet<>();
		System.out.println();
		retainNames.retainAll(boyNames);
		retainNames.retainAll(boyNames2);
		retainNames.forEach(System.out::println);
		/*
		 * String atext = "Hello"; String btext = "hello"; String ctext =
		 * String.join("l", "He", "lo"); String dtext = "He".concat("llO");
		 * 
		 * System.out.println(atext.equals(btext));
		 * System.out.println(atext.hashCode()); System.out.println(btext.hashCode());
		 * System.out.println(ctext.hashCode());
		 * 
		 * List<String> helloList = new ArrayList<String>(Arrays.asList(atext, btext,
		 * ctext, dtext));
		 * 
		 * helloList.forEach(s -> System.out.println(s + " " + s.hashCode()));
		 * System.out.println(""); for (String helloString : helloList) {
		 * System.out.println(helloString.hashCode());
		 * System.out.println(helloString.equals(atext)); }
		 * 
		 * System.out.println(helloList.size());
		 * 
		 * Set<String> mySet = new HashSet<>(helloList);
		 * 
		 * mySet.forEach(s -> System.out.println(s + " " + s.hashCode() + " " +
		 * mySet.size()));
		 */
		PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
		PlayingCard kingClubs = new PlayingCard("Clubs", "King");
		PlayingCard queensSpades = new PlayingCard("Spades", "Queen");
		PlayingCard queensSpades2 = new PlayingCard("Spades", "Queen");
		List<PlayingCard> cards = new ArrayList<>(Arrays.asList(aceHearts, kingClubs, queensSpades, queensSpades));

		System.out.println(cards);
		System.out.println("Card");
		for (PlayingCard setHash : cards) {
			setHash.setInternalHash(setHash.hashCode());

		}

		System.out.println(cards);

		cards.forEach(s -> System.out.println(s.hashCode()));

		Set<PlayingCard> deck = new HashSet<>();
		for (PlayingCard c : cards) {
			if (!deck.add(c)) {
				System.out.println("Found a duplicate for " + c);
			}
		}
		System.out.println(deck);

	}

}
