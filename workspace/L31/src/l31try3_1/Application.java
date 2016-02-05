package l31try3_1;

import java.util.ArrayList;

class Machine {

	public String toString() {

		return "I am an machine";

	}

	public void start() {

		System.out.println("Machine Started");
	}

}

class Camera extends Machine {

	public String toString() {

		return "I am Camera";

	}

	@Override
	public void start() {
		System.out.println("Camera Started");
	}

	public void snap() {

		System.out.println("Camera snapped.");
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());

		showList(list1);

		System.out.println();

		ArrayList<Camera> list2 = new ArrayList<>();

		list2.add(new Camera());

		showList1(list2);

	}

	private static void showList(ArrayList<? extends Machine> list) {

		for (Machine script : list) {

			System.out.println(script);

			script.start();

		}

	}

	private static void showList1(ArrayList<? extends Camera> list1) {

		for (Camera script1 : list1) {

			System.out.println(script1);

			script1.snap();

			script1.start();

		}

	}

}
