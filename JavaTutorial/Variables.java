package Lab01;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variabble de tipo String
		String name = "John"; 
		System.out.println(name);
		
		//Variable de tipo int
		int myNum = 15; 
		System.out.println(myNum);
		
		//Asignaion de valor
		int myNum1;
		myNum1 = 15;
		System.out.println(myNum1);
		
		//Otros tipos de variables
		int myNum2 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		//Concatenacion
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		//DECLARACION DE MULTIPLES VARIABLES
		int x, y, z;
		x = y = z = 50;
		System.out.println(x + y + z);
		
		// Identificadores
        double altura =1.85;
        float peso =64.4F;
        System.out.println("su estatura es: "+altura);
        System.out.println("su peso corporal es: "+ peso);
	}

}
