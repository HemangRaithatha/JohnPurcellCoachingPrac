package l28try1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte myByte = 123;

		int myInt = 542534;

		long myLong = 2325444;

		short myShort = 4342;

		float myFloat = 545.3f;

		double myDouble = 4235.5443;
		
		myInt = (byte)myByte;
		
		System.out.println(myInt);
		
		myInt = (int)myLong;
		
		System.out.println(myInt);

		
		myInt = myShort;
		
		System.out.println(myInt);

		
		myInt = (int)myFloat;
		
		System.out.println(myInt);

		
		myDouble = myFloat;
		
		System.out.println(myDouble);
		
		myByte = (byte)128;
		
		System.out.println(myByte);

		
	}

}
