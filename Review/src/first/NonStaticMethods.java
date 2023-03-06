package first;

public class NonStaticMethods {

	public static void main(String[] args) {
		//Just delete static key word
		/*to call non static method to static method we had to 
		create object of the class*/
		/*NameOfClass NameOfObject = new ContructorOfClass(); */
		 NonStaticMethods objc = new NonStaticMethods();
		 objc.ProfitOfCompany();
		 objc.ProfitOfCompanyMonthly(100000, 20000, "April");
		
		
	}
	
	public  void ProfitOfCompany() {
		int income=100000;
		int expense=60000;
		int profit=income-expense;
		System.out.println("Profit of company="+profit);
		
	}
	
	public  void ProfitOfCompanyMonthly(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		
	}
	
	public  int ProfitOfCompanyMonthlyWithReturnType(int income,int expense,String Name) {
		int profit=income-expense;
		System.out.println("Profit of company for "+Name+"="+profit);
		return profit;
		
	}
	//How to create Constructor
	public NonStaticMethods() {
		System.out.println("Constructor is used");
		
	}

}
