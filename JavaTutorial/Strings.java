package Lab01;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); // Outputs 7
		
		//Concatenacion
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		//caracteres especiales
		// \n New Line
		// \r Carriage Return
		// \t Tab
		// \b backspace
		// \f form feed
	}

}
