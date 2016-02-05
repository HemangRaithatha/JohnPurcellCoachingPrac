package l26try2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant1 = new Plant();

		plant1.grow();

		Tree tree1 = new Tree();

		System.out.println();
		tree1.grow();

		Plant plant2 = new Tree();

		System.out.println();
		plant2.grow();

		System.out.println();

		tree1.sheadLeaves();

		// plant2.sheadLeaves();
		
		System.out.println();
		
		doGrow(plant1);
		doGrow(tree1);
		
		doGrow(plant2);

	}

	private static void doGrow(Plant plant) {

		plant.grow();

	}
}
