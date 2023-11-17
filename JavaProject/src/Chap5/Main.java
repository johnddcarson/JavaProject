package Chap5;

//import static Chap5.Mammal.myName;

public class Main {

	public static void main(String[] args) {

		// Animal animal = new Animal(10);
		Lion lion = new Lion(4, true);
		BabyLion babyLion = new BabyLion(10, false, 100);
		BabyLion babyLion2 = new BabyLion();
		Object lemurAsObject = babyLion2;
		// lemurAsObject = new BabyLion();

		babyLion2.setAge(babyLion.getAge());
		babyLion2.setLionMane(babyLion.isLionMane());
		babyLion2.setTailLength(babyLion.getTailLength());
		lion.roar();

		babyLion.setTailLength(99);
		babyLion2.setTailLength(500);
		// animal.info();

		lion.info();
		lion.doSomthing();
		lion.eatPlants();
		System.out.println(lion.eatPlants(10));
		lion.drinkWater(10);
		lion.drinkWater(6.2);
		lion.eatPlantsDefault();

		babyLion.info();
		babyLion.doSomthing();
		babyLion.eatPlants();
		// System.out.println(lion.getlegs());
		System.out.println(babyLion.getlegs());
		babyLion.eatPlantsDefault();

	}

}
