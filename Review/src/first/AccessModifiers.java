package first;

public class AccessModifiers {

	public static void main(String[] args) {
		//Access for same package with public 
		//for private their is not access from other class or package
		//Public * Private * Default * Protected.
		NonStaticMethods ob = new NonStaticMethods();
		ob.ProfitOfCompany();
		
		MethodOverLoading obj= new MethodOverLoading();
		obj.addition();
		obj.division();
		obj.multiplication();  
		
	}

}
