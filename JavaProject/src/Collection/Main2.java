package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		List<Card> standardDeck = Card.getStandardDesk();

		Card.printDeck(standardDeck);

		Card[] cardArray = new Card[13];

		Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
		Arrays.fill(cardArray, aceOfHearts);

		Card.printDeck(Arrays.asList(cardArray), "Aces of hearts", 1);

		Collections.shuffle(standardDeck);
		printDeck(standardDeck);

		Collections.reverse(standardDeck);

		printDeck(standardDeck);

		// var sortingAlgorithm =
		// Comparator.comparing(Card::rank).thenComparing(Card::suit);
		var sortingAlgorithm = Comparator.comparing(Card::suit).thenComparing(Card::rank);
		Collections.sort(standardDeck, sortingAlgorithm);

		printDeck(standardDeck);

		List<Card> diamond = new ArrayList<>(standardDeck.subList(13, 26));
		Card.printDeck(diamond, "Diamond are forever", 1);

		Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
		System.out.println(standardDeck.contains(tenOfHearts));
		System.out.println(standardDeck.indexOf(tenOfHearts));
		System.out.println(tenOfHearts);

		Collections.shuffle(standardDeck);
		System.out.println(standardDeck.contains(tenOfHearts));
		System.out.println(standardDeck.indexOf(tenOfHearts));
		System.out.println(tenOfHearts);

		List<Card> deck = Card.getStandardDesk();

		Collections.sort(deck, sortingAlgorithm);
		printDeck(deck);

		System.out.println(Collections.max(deck, sortingAlgorithm));
		System.out.println(Collections.min(deck, sortingAlgorithm));

		List<Card> copied = new ArrayList<>(deck.subList(0, 13));
		Card.printDeck(copied, "Copied Desk", 1);
		Collections.rotate(copied, 10);
		Card.printDeck(copied, "Copied Desk", 1);

		copied = new ArrayList<>(deck.subList(0, 13));
		Card.printDeck(copied, "Copied Desk", 1);
		for (int i = 0; i < copied.size() / 2; i++) {

			Collections.swap(copied, i, copied.size() - 1 - i);

		}
		Card.printDeck(copied, "Copied Desk", 1);
	}

	public static void printDeck(List<Card> cardDeck) {
		Card.printDeck(cardDeck);

	}
}
