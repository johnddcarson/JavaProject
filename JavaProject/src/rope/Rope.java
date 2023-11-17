package rope;

import javax.management.loading.PrivateClassLoader;

public class Rope {
	private static final String leftRope;
	public static int LENGTH = 5;
	public static int WIDTH = 5;
	static {
		LENGTH = 10;
	}

	public static void swing() {
		System.out.print("swing ");
	}

	public void climb() {
		System.out.println("climb ");
	}

	public void play() {
		swing();
		// climb();
	}

	public static void main(String[] args) {
		private static rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();
	}

}
