package Inheritance;

public class B extends A {
	public static void main(String[] args) {
		//Inheritance: to connect to combine two or more class
	B ob = new B();
	ob.phone();
	ob.addition();
	ob.subtraction();
	ob.MethodOfC();
	
	
	}
	public void phone() {
	}
	@Override
	public void subtraction() {
		System.out.println("This is Overriding");
	    int d=6;
	}
	/*Overriding is to use same method declared in parent class
	 * just can change the body not argument*/
	
	
 
}
