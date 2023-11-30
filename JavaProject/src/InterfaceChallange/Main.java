package InterfaceChallange;

public class Main {

	public static void main(String[] args) {

		Player player = new Player("John Carson", 100, 200);
		Player player2 = new Player("Jason kelce", 100, 200);

		player.read(player.write());
		player2.read(player2.write());

		String roar1 = "roar";

		roar1 = roar1.concat("!!!");

		System.out.println(roar1);

	}
}