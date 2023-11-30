package A2;

import A1.Bird;

public class GooseWatcher extends Bird {

	private String color;
	private int weight;
	private int weight2;

	public GooseWatcher(int weight, int weight2) {
		this("Brown", weight);
		this.weight2 = weight2;
	}

	public GooseWatcher(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public static void main(String[] args) {
		GooseWatcher gooseWatcher = new GooseWatcher("Blue", 12);
		GooseWatcher gooseWatcher2 = new GooseWatcher(12, 24);

	}

}
