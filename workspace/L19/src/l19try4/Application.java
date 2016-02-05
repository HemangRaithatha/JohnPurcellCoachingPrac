package l19try4;

class Thing {

	public String name;

	public static String description;

	public static final int LUCKY_NUM = 33;

	public int id;

	public static int count = 0;

	public Thing() {
		id = count;
		count++;
	}

	public void showName() {
		System.out.println("The product id is " + id + " " + description + ": " + name);
	}

	public static void showInfo() {
		System.out.println("Hello");
	}
}

public class Application {

	public static void main(String[] args) {

		Thing.description = "I am a Thing";
		Thing.showInfo();

		System.out.println(Thing.description);

		System.out.println();

		System.out.println("Before creating object count: " + Thing.count);
		Thing thingOne = new Thing();

		thingOne.name = "Hemang Raithatha";

		

		Thing thingTwo = new Thing();

		System.out.println("After creating object count: " + Thing.count);

		thingTwo.name = "Neha Raithatha";

		System.out.println();
		
		thingOne.showName();
		thingTwo.showName();

		System.out.println(Math.PI);

		System.out.println(Thing.LUCKY_NUM);

	}

}
