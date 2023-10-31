package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

record Player(String name, List<Card> playersCards, int playerNumber) {

	private static int playerCount = 0;

	public Player(String name, List<Card> playersCards) {
		this(name, playersCards, ++playerCount);
	}

	@Override
	public String toString() {
		return "Player " + playerNumber + " " + name + ", playersCards=" + playersCards;
	}

};

public class MainChallange {

	public static void main(String[] args) {

		List<Card> standardDeck = Card.getStandardDesk();

		List<Card> diamond = new ArrayList<>(standardDeck.subList(13, 26));

		Card.printDeck(standardDeck);

		/*
		 * Player player1 = new Player("John Carson", Card.dealPlayerHand(standardDeck,
		 * 7)); Player player2 = new Player("Heather Carson",
		 * Card.dealPlayerHand(standardDeck, 13)); System.out.println(player1);
		 * System.out.println(player2); System.out.println("Cards left in deck " +
		 * standardDeck.size());
		 * 
		 * Card.printDeck(standardDeck);
		 */

		Player player1 = new Player("John Carson", Card.dealPlayerHand2(standardDeck, 7));
		var sortingAlgorithm = Comparator.comparing(Card::suit).thenComparing(Card::rank);
		Collections.sort(player1.playersCards(), sortingAlgorithm);
		Player player2 = new Player("Heather Carson", Card.dealPlayerHand2(standardDeck, 7));
		System.out.println(player1);
		System.out.println(player2);
		System.out.println("Cards left in deck " + standardDeck.size());

		Card.printDeck(standardDeck);

	}

}
