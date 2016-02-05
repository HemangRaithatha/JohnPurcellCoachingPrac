package l38try1;

public class Application {

	public static void main(String[] args) {

		Camera cam1 = new Camera();

		cam1.setId(558);

		System.out.println(cam1.getId());
		
		cam1.run();
		cam1.info();
		System.out.println();
		
		Car car1 = new Car();

		car1.setId(549);
		
		System.out.println(car1.getId());
		
		
		car1.run();
		car1.info();

	}

}
