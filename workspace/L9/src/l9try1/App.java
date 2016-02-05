package l9try1;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MachineStart msa = new MachineStart();
		
		msa.machineStart();
		
		
		int istop = 0;
		do{
			MachineStop mso = new MachineStop();
			
			mso.machineStop();
		}while(istop != 558);

	}
		
}
