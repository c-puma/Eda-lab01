package Lab01;

public class MetodosParametros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  myMethod("Liam", 5);
		  myMethod("Jenny", 8);
		  myMethod("Anja", 31);
		  System.out.println(myMethodReturn(3));
		  checkAge(20); // Call the checkAge method and pass along an age of 20
	}
	
	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	static int myMethodReturn(int x) {
	    return 5 + x;
	}
	
	static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	    	System.out.println("Access denied - You are not old enough!");

	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	    	System.out.println("Access granted - You are old enough!");
	    }
	}
}
