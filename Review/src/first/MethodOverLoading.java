package first;

public class MethodOverLoading {
  int d=6;//globl variable
	public static void main(String[] args) {
		//Method Overloading: allowed you to create some method some name
				/* add different number of arguments
			    ** data type for arguments should different*/
		MethodOverLoading obj= new MethodOverLoading();
		obj.addition();
		obj.subtration();
		obj.division();
		obj.multiplication();
	}
	public void addition() {
		int d=6;//local variable
		System.out.println(d);
	}
	public void addition(int d) {
		int t=this.d;//this key word for globe variable
	}
	public void addition(int d, float t) {}
	//for private their is not access from other class or package
	private void subtration() {}//just inside class
	protected void division() {}
	void multiplication() {}
}
