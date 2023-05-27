package Lab01;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//formas de iniciarlizar aareglos
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] myNum = {10, 20, 30, 40};
		
		System.out.println(cars[0]);// Outputs Volvo
		System.out.println(cars.length);// Outputs 4
		
		//Recorrer un arreglo
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//Arreglo bidimensional
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]); // Outputs 7
		
		//Recorrer un arreglo bidimensional
		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		    	  System.out.println(myNumbers[i][j]);
		      }
		}
	}

}
