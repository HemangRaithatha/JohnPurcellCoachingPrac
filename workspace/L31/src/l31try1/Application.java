package l31try1;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am an machine";
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am an Camera";

	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		list2.add(new Camera());

		System.out.println(list1.get(2));

		System.out.println();

		showList(list1);

		System.out.println(list2.get(2));

		System.out.println();

		showList(list2);
	}

	public static void showList(ArrayList<?> list) {

		for (Object value : list) {

			System.out.println(value);
		}

	}

}
