package l31try3;

import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am an Machine";
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am an Camera";
	}

}

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Machine> strings = new ArrayList<>();

		strings.add(new Machine());

		strings.add(new Machine());

		showList(strings);

		System.out.println();

		////////////// CAMERA/////////////////////////

		ArrayList<Camera> strings1 = new ArrayList<>();

		strings1.add(new Camera());
		strings1.add(new Camera());

		showList(strings1);

	}

	public static void showList(ArrayList<?> string) {
		for (Object value : string) {

			System.out.println(value);
		}
	}
}
