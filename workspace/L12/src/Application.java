
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = { { 11, 22, 33, 44 }, { 55, 66, 77 }, { 88, 99 } };

		System.out.println(numbers[0][1]);

		System.out.println(numbers[1][1]);

		System.out.println();

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {

				StringBuilder sb = new StringBuilder();

				sb.append(numbers[row][col]).append("\t");

				System.out.print(sb.toString());

			}

			System.out.println();
		}
	}

}
