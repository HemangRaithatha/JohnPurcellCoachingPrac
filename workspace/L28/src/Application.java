
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myInt = 112;

		byte myByte = 122;

		long myLong = 423423;

		short myShort = 534;

		float myFloat = (float) 54.5453;

		double myDouble = 434.4645;

		
		myByte =(byte)myInt;
		
		System.out.println(myByte);
		
		myDouble = myInt;
		
		System.out.println(myDouble);
		
		myInt = (int)myFloat;
		
		System.out.println(myInt);
		
		myByte = (byte)128;
		
		System.out.println(myByte);
	}

}
