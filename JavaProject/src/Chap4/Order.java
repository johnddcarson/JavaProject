package Chap4;

public class Order {

	static String result = "";
	{
		result += "c";
	}
	static {
		result += "u";
	}
	{
		result += "r";
	}

	public static void main(String[] args) {
		System.out.print(Order.result + " ");
		System.out.print(Order.result + " ");
		new Order();
		new Order();
		System.out.print(Order.result + " ");

	}

	public static void walk1(int... nums) {

		System.out.println(" Hello number " + nums[0]);
		System.out.println("Hello number " + nums[1]);
	}

}
