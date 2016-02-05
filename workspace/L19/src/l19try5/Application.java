package l19try5;

class Thing {

	public String name;

	public static String description;

	public final static int MY_LUCKY_NUM = 558;

	public static int count = 0;

	public int id;

	public Thing() {
		id = count;
		count++;
	}

	public void showName() {

		System.out.println("Object Id: " + id + ". " + description + ": " + name);
	}

	public static void sayHello() {

		System.out.println("Hello");
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////// Using Statics/////////

		System.out.println("Before Creating object the count is: " + Thing.count);

		Thing.description = "I am an Thing";

		System.out.println(Thing.description);

		Thing.sayHello();

		System.out.println();

		////////// Using Variables//////////////////

		//////// Thing One/////
		Thing thing1 = new Thing();

		thing1.name = "Hemang";

		thing1.showName();

		System.out.println();

		/////// Thing Two//////
		Thing thing2 = new Thing();

		thing2.name = "Neha Raithatha";

		thing2.showName();

		///////// Constant//////
		System.out.println();

		System.out.println(Math.PI);

		System.out.println();

		System.out.println(Thing.MY_LUCKY_NUM);

		System.out.println("After Creating object the count is: " + Thing.count);

	}

}
