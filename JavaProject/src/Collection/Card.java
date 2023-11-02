package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Collection.Card.Suit;

public record Card(Suit suit, String face, int rank) {

	public enum Suit {
		CLUB, DIAMOND, HEART, SPADE;

		public char getImage() {
			return switch (this) {
			case CLUB -> 9827;
			case DIAMOND -> 9830;
			case HEART -> 9829;
			case SPADE -> 9824;
			default -> 0;
			};
		}

	}

	@Override
	public String toString() {
		int index = face.equals("10") ? 2 : 1;

		String faceString = face.substring(0, index);

		return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
	}

	public static Card getNumericCard(Suit suit, int cardNumber) {

		if (cardNumber > 1 && cardNumber < 11) {
			return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);

		}
		System.out.println("Invalid card selected");
		return null;

	}

	public static Card getFaceCard(Suit suit, char abbrev) {

		int charIndex = "JQKA".indexOf(abbrev);
		if (charIndex > -1) {
			return new Card(suit, "" + abbrev, charIndex + 9);
		}
		System.out.println("Invalid face card selected");
		return null;

	}

	public static List<Card> getStandardDesk() {

		List<Card> deskCards = new ArrayList<Card>(52);

		for (Suit suit : Suit.values()) {
			for (int i = 2; i <= 10; i++) {
				deskCards.add(getNumericCard(suit, i));
			}
			for (char c : new char[] { 'J', 'Q', 'K', 'A' }) {
				deskCards.add(getFaceCard(suit, c));
			}

		}
		return deskCards;
	}

	public static List<Card> dealPlayerHand(List<Card> deckOfCards, int numberOfCards) {
		Random randomCard = new Random();
		Collections.shuffle(deckOfCards);
		List<Card> dealCards = new ArrayList<>(7);

		if (deckOfCards.size() > numberOfCards) {
			for (int i = 0; i < numberOfCards; i++) {
				int index = randomCard.nextInt(deckOfCards.size());
				dealCards.add(deckOfCards.get(index));
				deckOfCards.remove(index);
			}
		} else {
			System.out.println("Error");
		}

		return dealCards; // This should be placed after the if-else block.
	}

	public static List<Card> dealPlayerHand2(List<Card> deckOfCards, int numberOfCards) {
		// List<Card> shuffledDeck = new ArrayList<>(deckOfCards); // Create a copy of
		// the deck to avoid modifying the
		// original deck.
		Collections.shuffle(deckOfCards);

		List<Card> dealCards; // Declare the dealCards list here.

		if (deckOfCards.size() >= numberOfCards) {
			dealCards = new ArrayList<>(deckOfCards.subList(0, numberOfCards));
			deckOfCards.subList(0, numberOfCards).clear();
		} else {
			System.out.println("Error");
			return null; // Return null or handle the error as needed.
		}

		return dealCards;
	}

	public static void printDeck(List<Card> deck) {
		printDeck(deck, "Current Deck", 4);
	}

	public static void printDeck(List<Card> deck, String description, int rows) {

		System.out.println("---------------------------");
		if (description != null) {
			System.out.println(description);
		}
		int cardsInRow = deck.size() / rows;
		for (int i = 0; i < rows; i++) {
			int startIndex = i * cardsInRow;
			int endIndex = startIndex + cardsInRow;
			deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
			System.out.println();
		}
	}

}
