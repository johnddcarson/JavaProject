package A1Z0808;

import static rope.Rope.LENGTH;
import static rope.Rope.WIDTH;

import rope.Rope;

public class Chimp {

	public static void main(String[] args) {
		Rope.swing();
		Rope r1 = new Rope();

		r1.swing();
		new Rope().swing();

		System.out.println(LENGTH);
		System.out.println(WIDTH);

	}

}
