
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plantOne = new Plant();

		Tree treeOne = new Tree();

		Plant plantTwo = plantOne;

		Plant plantThree = treeOne;

		plantTwo.grow();

		treeOne.sheddingLeaves();

		plantThree.grow();

		doGrow(plantThree);

		doGrow(plantTwo);

	}

	public static void doGrow(Plant plant) {

		plant.grow();

	}

	public static void doShed(Tree tree) {

		tree.sheddingLeaves();

	}
}
