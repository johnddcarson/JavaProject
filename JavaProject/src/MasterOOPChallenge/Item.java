package MasterOOPChallenge;

public class Item {

	private String name;
	private String type;
	private double price;
	private String size;

	public Item(String name, String type, double price) {
		super();
		this.name = name.toUpperCase();
		this.type = type.toUpperCase();
		this.price = price;
		this.size = "Medium";
	}

	public String getName() {

		if (type.equals("SIDE") || type.equals("DRINK")) {
			return size + " " + name;
		}
		return name;
	}

	public double getBasePrice() {
		return price;
	}

	public double getAdjustedPrice() {
		return switch (size) {
		case "Small" -> getBasePrice() - 0.5;
		case "Large" -> getBasePrice() + 1;
		default -> getBasePrice();
		};
	}

	public String getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public static void printItem(String name, double price) {
		System.out.printf("%-20s:%8.2f%n", name, price);
	}

	public void printItem() {
		if (getName().equals("DRINK") || getName().equals("SIDE")) {
			printItem(getName() + " " + getType(), getAdjustedPrice());
		} else {
			printItem(getName(), getAdjustedPrice());
		}
	}

}
