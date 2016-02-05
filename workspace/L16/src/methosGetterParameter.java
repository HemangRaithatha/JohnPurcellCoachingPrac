class Robot {

	String name;

	int age = 23;

	public void speak(String text) {

		System.out.println("My name is: " + text);

	}

	public void myAge(int age) {

		System.out.println("My age is " + age);
	}

	public void speakHello() {

		System.out.println("Hello world");
	}

	public void left40() {

		int yearsLeft = 40 - age;

		System.out.println("No. of years left to turn 40: " + yearsLeft);
	}

	int getAge50() {

		int yearsLeft50 = 50 - age;

		return yearsLeft50;
	}
}

public class methosGetterParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot robotOne = new Robot();

		robotOne.speak("Hemang");

		robotOne.myAge(23);

		robotOne.speakHello();

		robotOne.left40();

		int getting50 = robotOne.getAge50();

		System.out.println("No of years left to turn 50 is: " + getting50);
	}

}
