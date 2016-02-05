package l32try1;

class Machine {

	public void start() {

		System.out.println("Machine started");
	}

	public void stop() {
		System.out.println("Machine Stopped");
	}

}

interface Plant {

	public void grow();
	public void fruit();

}

public class Application {

	public static void main(String[] args) {

		//////////// Class////////////////////////

		Machine machine1 = new Machine() {

			@Override
			public void start() {
				System.out.println("Machine One Started");
			}

			@Override
			public void stop() {
				System.out.println("Machine One Stopped");
			}

		};

		machine1.start();
		machine1.stop();

		System.out.println();
		//////////////// Interface/////////////////////

		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant is growing");

			}

			public void fruit() {
				System.out.println("This plant produce crons");
			}

		};

		plant1.grow();
		plant1.fruit();

	}

}
