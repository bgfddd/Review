package Second;

import first.MethodOverLoading;

public class Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj= new MethodOverLoading();
		obj.addition();
		Hiding it=new Hiding();
		/*we can't call non static in static method form a other call in same package*/
		it.setting(600);
		
	}

}
