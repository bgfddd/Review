package first;

public class Methods {

	public static void main(String[] args) {
		/*Methods
         *Method without arguments
         **Method with arguments
         ***Method with return tape */
		//First create method
		
		
		//to executed method we need to the method
		//we can call multip time
		ProfitOfCompan();//1
		//Insert the arguments
		ProfitOfCompanyMonthly(100000, 60000, "January");//2
		ProfitOfCompanyMonthly(100000, 60000, "February");//2
		int profitbeforetax=ProfitOfCompanyMonthlyWithReturnTupe(100000, 60000, "January");//3
		System.out.println("Profit before tax ="+profitbeforetax);  //3
	
	}
	
	//1
	// Method without arguments
	//This method is not main method  not executed 
    public  static void ProfitOfCompan() {
    	int income=100000;
		int expense=60000;
		int profit=income-expense;
		System.out.println("Profit of company="+profit);
		
    }
	
    //**Method with arguments
     //Insert the arguments
    //2
    public static void ProfitOfCompanyMonthly(int income,int expense,String Name) {
    	int profit=income-expense;
    	System.out.println("Profit of company for "+Name+"="+profit);
    	
    }
    //3
    //Method with return type
    public static int ProfitOfCompanyMonthlyWithReturnTupe(int income,int expense,String Name) {
    	int profit=income-expense;
    	System.out.println("Profit of company for "+Name+"="+profit);
    	return profit;
    }
    
    
    
	
}
