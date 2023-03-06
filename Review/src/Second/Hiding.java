package Second;

public class Hiding {
private int d;

    public int getD() {
	return d;
    }
    public void setD(int d) {
	this.d = d;
    }
    //Encapsulation or Data Hiding
/*how to generate get & set*/
/*Right click in the class chose source - generate getters & setters */

private int t;

	public static void main(String[] args) {
/*to call non static in static method we need object of the class */
		Hiding ob=new Hiding();
		ob.addition();
		ob.setD(1000);

	}
	private void addition() {
		int i=6;
		int x=800000;
		int d=i+x;
		System.out.println(d);
	}
/*Non static to non static just call it we don't need object of the class*/
	public void sddition6() {
		addition();
	}
	
	public void setting(int d) {
		this.d=d;
		System.out.println(this.d);
	}
	/*Encapsulation is one of the fundamental OOP (Object-Oriented Programming)concepts.
	 *The fields in a class are made private so that it cannot be accessed by anyone outside the class. 
	 *To accessed the class we need object of the class.
	 *Encapsulation data is accessed using the getter (get) and setter (set) methods*/
	
}
