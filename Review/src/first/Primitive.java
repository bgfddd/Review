package first;

import java.util.Date;

public class Primitive {

	public static void main(String[] args) {
	
     //How to print in the console
        System.out.println("Dihia");
        System.out.println("Hello world");
     //System.out.println("test");
        
       
     //data-type name of variable = value
        boolean   d=false;
     //how to print the value of variable
       System.out.println(d);
     //System.out.println(value); 
     
       System.out.println("this  to value for boolean="+d);
     //System.out.println("test"+value);
     
     //how to declare variable
       int i=100000000;
       byte b=126;
       char c= 'u';
       long l=1000000000000000000L;
       float f=6.6f;
       double db=6666666.66;
       short s=10000;
     System.out.println("byte="+b);
		
		
		int k=6000;
		int w=2000;
		int addition=k+w;
		int subtract=k-w;
		int multiply=k*w;
		int division=k/w;
		int remainder=k%w;
		System.out.println(addition);  
		System.out.println("Addition result="+addition);
		
		
		
		
		
		
		//Decrement and Increment
		int x=6;
		//x--;
		int t=x++;//assigning the value, Increasing the value
	  //int t=++x;//Increasing the value, Assigning the value
		System.out.println("This is value for x="+x);
		System.out.println("This is value for t="+t);
		
		
		
   
    //Non primitive data types
     int [] students= new int[3];
     students [0]=1000;
     students [1]=2000;
     students [2]=3000;
     //How to print Array
     System.out.println("that is student id number:"+students[0]);
    //size of arrays
     System.out.println(students.length); 
     
		
		
		
		//print today date
     byte age =30;
     Date now=new Date();  //Object
     System.out.println(now);
     
     //print the string data type
     String n="Welcome";
     Date lol=new Date();
     System.out.println(n);
     System.out.println(lol);
     
     
		
		
		
	}

}
