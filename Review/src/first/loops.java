package first;

public class loops {

	public static void main(String[] args) {
		//While Loop
		//while loop check condition and when execute the code
		//Ascending order
        int i=1;
	    while(i<=100) {
		     System.out.println(+i+ " -This is my name:Dihia");
		      i++;
         	}
	    
	    //Descending order
        int a=100;
	    while(a>=1) {
		     System.out.println(+a+ " -This is my name:Dihia");
		      a--;
        	}
	    
	    //Do while loop
	    //do while loop execute the code first and check the condition
	    //Increment 1 to 100
	    int b=1;
	    do {
	    	System.out.println(+b+ " -This is my name:Dihia");
	    	b++;
	    }while (b<=100);
	    
	    //Decrement 100 to 1
	    int c=100;
	    do {
	    	System.out.println(+c+ " -This is my name:Dihia");
	    	c--;
	    }while (c>=1);
	    
		int d=1;  //does not execute
	    while(d==100) {
		     System.out.println(+d+ " -This is my name:Dihia");
		      d++;
        	}
		
	    int e=1;// Execute at list one time
	    do {
	    	System.out.println(+e+ " -This is my name:Dihia");
	    	e++;
	    }while (e==100);
	    
	    // for loop 
		//For Loops 
		/*-Used ONLY when we know EXACTLY how many times we would 
		like to loop/iterate*/
		//Initialize
		//Condition
		//Increment or decrement operator 
	    //Increment
	    for(int f=1;f<=100;f++) {
	    	System.out.println(+f+" -This is my name:Dihia");
	    }
	    //Decrement
	    for(int h=100;h>=1;h--) {
	    	System.out.println(+h+" -This is my name:Dihia");
	    }
	    
	    
	    
	}

}
