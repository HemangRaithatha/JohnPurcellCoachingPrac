package l27try1;

class Random {

	private String name;

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static final int ID = 558;

	public void b() {

		int i = 10 * a * c();

		System.out.println(i);
	}

	private int c() {

		int c = 10;

		return c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Application {
	public static void main(String[] args) {

		Random rand1 = new Random();

		rand1.setA(22);

		rand1.b();
	}

}
