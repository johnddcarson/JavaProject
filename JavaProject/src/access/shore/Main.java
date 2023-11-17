package access.shore;

public class Main {

	private String name;
	private int age;
	private Integer dobInteger;

	private boolean happy;

	static int gol = 123;

	public Main() {
		System.out.println("Print");
	}

	public Main(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public Main(String name, int age, Integer dob) {
		this(name, age);
		this.dobInteger = dob;
	}

	public static void main(String[] args) {
		System.out.println(Main.gol);
		Main main = new Main();
		Main main2 = new Main("John", 18);
		Main main3 = new Main("Jack", 28, 123);

		System.out.println(main2.name);

		System.out.println(main.toString());
		System.out.println(main2.toString());
		System.out.println(main3.toString());

	}

	@Override
	public String toString() {
		return "Main [name=" + name + ", age=" + age + ", dobInteger=" + dobInteger + "]";
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected Integer getDobInteger() {
		return dobInteger;
	}

	protected void setDobInteger(Integer dobInteger) {
		this.dobInteger = dobInteger;
	}

	public void methD(String values, int... f) {
		System.out.println("Yes");

	}

	protected boolean isHappy() {
		return happy;
	}

	protected void setHappy(boolean happy) {
		this.happy = happy;
	}

}
