package Hash;

import java.util.Objects;

public class PlayingCard {

	private String suit;

	private String face;

	private int internalHash;

	public PlayingCard(String suit, String face) {
		this.suit = suit;
		this.face = face;
		this.internalHash = hashCode();
	}

	@Override
	public int hashCode() {
		int result = suit.hashCode();
		result = 31 * result + face.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCard other = (PlayingCard) obj;
		return Objects.equals(face, other.face) && Objects.equals(suit, other.suit);
	}

	@Override
	public String toString() {
		return "PlayingCard [suit=" + suit + ", face=" + face + ", internalHash=" + internalHash + "]";
	}

	protected String getSuit() {
		return suit;
	}

	protected void setSuit(String suit) {
		this.suit = suit;
	}

	protected String getFace() {
		return face;
	}

	protected void setFace(String face) {
		this.face = face;
	}

	protected int getInternalHash() {
		return internalHash;
	}

	protected void setInternalHash(int internalHash) {
		this.internalHash = internalHash;
	}

}
