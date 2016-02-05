class Thing {

	public String name;

	public static String description;

	public final static int LUCKY_NUMBER = 7;

	public static int count;
	
	public int id;
	

	public Thing() {
		
		id = count;

		count++;
	}

	public void tellNick() {

		System.out.println("Object id number " + id + " " + description + ": " + name);
	}

	public static void sayHello() {

		System.out.println(description);
	}

}

public class L19_try1 {
	public static void main(String[] args) {

		Thing.description = "We are a thing";

		Thing.sayHello();

		System.out.println("No of object in the program before creating one: " + Thing.count);

		Thing thingOne = new Thing();

		Thing thingTwo = new Thing();
		
		System.out.println("No of the objects in the program after creating one " + Thing.count);

		thingOne.name = "Hemang";
		thingTwo.name = "Asus";

		thingOne.tellNick();
		thingTwo.tellNick();

		System.out.println(Math.PI);

		System.out.println(Thing.LUCKY_NUMBER);

	}
}
