package l45try1;

public class App {

	public static void main(String[] args) {

		System.out.println(calculate(8));
	}

	private static int calculate(int value) {

		if (value == 1) {

			return 1;
		}

		return calculate(value - 1) * (value);

	}
}
