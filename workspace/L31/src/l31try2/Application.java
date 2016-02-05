package l31try2;

import java.util.ArrayList;

class Machine {
	public String toString() {

		return "I am a machine";
	}

}

class Camera extends Machine {

	public String toString() {

		return "I am a Camera";
	}

}

public class Application {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Apple");
		list1.add("SpaceX");
		list1.add("Tesla");

		System.out.println(list1.get(1));
		showList(list1);

		System.out.println();

		ArrayList<Machine> list2 = new ArrayList<Machine>();

		list2.add(new Machine());
		list2.add(new Machine());
		list2.add(new Machine());
		showList(list2);
		
		System.out.println();

		ArrayList<Camera> list3 = new ArrayList<Camera>();

		list3.add(new Camera());
		list3.add(new Camera());
		list3.add(new Camera());
		showList(list3);

	}

	public static void showList(ArrayList<?> list) {
		for (Object value : list) {

			System.out.println(value);
		}
	}
}
