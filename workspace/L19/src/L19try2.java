class Stuff {

	public String name;

	public static String laptop;

	public static int rounds;
	
	public int no;

	public Stuff() {
		no = rounds;
		rounds++;
	}

	public final static int LUCKY_ME = 23;

	public void sayName() {

		System.out.println("Name of the thing is: " + name + ".");
	}

	public void subjectName() {

		System.out.println("Object No:" + no + laptop);
	}

}

public class L19try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stuff.laptop = "Asus";

		//Stuff.subjectName();

		System.out.println("Round before Stuff was created " + Stuff.rounds);
		Stuff thingOne = new Stuff();

		new Stuff();

		System.out.println("Round after Stuff was created " + Stuff.rounds);
		thingOne.name = "Hemang";

		thingOne.sayName();

		thingOne.subjectName();
		System.out.println(Math.PI);

		System.out.println(Stuff.LUCKY_ME);

	}

}
