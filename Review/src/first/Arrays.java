package first;

public class Arrays {

	public static void main(String[] args) {
		
		//One Dimensional Array
		int[] students=new int[10];
		//How  assigned a value to one dimensional array
		students[0]=1;
		students[2]=3;
		//students[10]=10; Run time error 
        //Compiler error just missing some same colon ext....
		System.out.println("This is students id:"+students[2]);
		System.out.println("This is students id:"+students[6]);
		//how to know how many arrays we have
		System.out.println(students.length);
		
		//How to user for loop
		for(int i=0;i<students.length;i++) {
			students[i]=i;
			System.out.println("students["+i+"]="+students[i]);
		}
		
	/*	//for each loop
		for(int d:students) {
			System.out.println(d);
		}
		
		
		//Single dimensional 
	    //How to create data type arrays in same line.
		  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	      System.out.println("This is a first array : "+cars[1]);
	      System.out.println(cars.length);
			     
			     
	      String[] vehicles= new String[4];
   	      vehicles[0]="Velvo";
   	      vehicles[1]="BMW";
	      vehicles[2]="Ford";
	      vehicles[3]="Mazda";
	      System.out.println("This is my first car :"+vehicles[2]);
	      System.out.println(vehicles.length);
				
		
		
		
		
		
		//Multi dimensional arrays
		int[][] rollnumbers=new int[3][6];
		rollnumbers[0][1]=1000;
		System.out.println("This is multip demantion array"+rollnumbers[0][1]);
		//how to know how many arrays we have
		System.out.println(rollnumbers.length);*/
		
		
		

			
		
		
		
		
		
		
		
		
		
		
	}

}
