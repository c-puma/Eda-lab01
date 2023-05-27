package Lab01;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Uso del break
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
				  break;
			  }
			  System.out.println(i);
		}
		
		//Uso del continue
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
				  continue;
			  }
			  System.out.println(i);
		}
	}

}
