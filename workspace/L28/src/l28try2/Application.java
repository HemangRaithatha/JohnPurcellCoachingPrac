package l28try2;


public class Application {

	public static void main(String[] args) {
		
		
		byte byteValue = 127;
		short shortValue = 334;
		
		int intValue = 1234;
		long longValue = 342356;
		
		float floatValue = 42.545f;
		double doubleValue = 342.534534;
		
		shortValue = byteValue; 
		
		System.out.println(shortValue);
		
		intValue = (int) longValue;
		
		System.out.println(intValue);
		
		doubleValue = (double)floatValue;
		
		System.out.println(doubleValue);
		
		floatValue = (float)doubleValue; 
		System.out.println();
		System.out.println(floatValue);
		
		intValue = (int)doubleValue;
		
		System.out.println();
		System.out.println(intValue);
		
		byte bv = (byte)128;
		
		System.out.println(bv);
		
		
	}
}
