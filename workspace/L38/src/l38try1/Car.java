package l38try1;

public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub

		System.out.println("Car has started ");

	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Cars dostuff");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car has stopped");
	}

	@Override
	public void info() {
		System.out.println("Car info");
	}

}
