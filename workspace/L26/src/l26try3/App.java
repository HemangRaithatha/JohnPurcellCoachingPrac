package l26try3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant1 = new Plant();
		
		plant1.grow();
		
		
		Tree tree = new Tree();
		
		tree.grow();
		
		Plant plant2 = tree; 
		
		plant2.grow();
		
		Plant plant3 = plant1; 
		plant3.grow();
		
		
	}

}
