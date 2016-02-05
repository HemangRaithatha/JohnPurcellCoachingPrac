
public class App {

	public static void main(String[] args) {

		int values[];

		values = new int[3];

		values[0] = 11;
		values[1] = 22;
		values[2] = 33;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		System.out.println();
		for (int i = 0; i < values.length; i++) {

			System.out.println(values[i]);
		}

		System.out.println();
		
		int[] numbers = {111,222,333,444,555};
		
		for(int i = 0;i<numbers.length; i++){
			
			System.out.println(numbers[i]);
			
		}
	}

}
