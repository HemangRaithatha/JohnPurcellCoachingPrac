class X {
	public int factorial(int value) {

		if (value == 1) {
			return 1;
		}

		return factorial(value - 1) * value;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x = new X();
		
		System.out.println(x.factorial(5));

	}

}
