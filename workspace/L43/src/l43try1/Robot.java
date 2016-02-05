package l43try1;

public class Robot {

	private int id = 558;

	public Robot(int id) {
		this.id = id;
	}

	class Brain {

		public void think() {
			System.out.println("Robort " + id + " is tinking...");
		}

	}

	public static class Battery {

		public void charging() {
			System.out.println("The battery is getting charged");
		}
	}

	public void start() {

		System.out.println("The robot id " + id + " has got started. \n");

		Brain brain = new Brain();

		brain.think();

		String name = "Hemang";
		class Temp {

			public void doSomething() {

				System.out.println("ID is " + id);

				System.out.println("The name is " + name);

			}
		}

		Temp temp = new Temp();
		
		temp.doSomething();
	}

}
