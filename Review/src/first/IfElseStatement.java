package first;

public class IfElseStatement {

	public static void main(String[] args) {
		
		//If  else statement Condition
				//Use &&  ||  !
				int A=6000;
				if(A>6000 || A==6000) {
					System.out.println("true");
				}
				if(A>6000 && A==6000) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
		        //declare variable and print the value is even or number
				int n=31;
				if(n%2==0) {
					System.out.println("Number is even");
				}else {
					System.out.println("Number is odd");
				}

				

				//if else if else statement
				/*Computer=90, Math=100, Software=70; total marks=300
				 * write program to calculate the  average of obtained marks*/
				
				int computer=90;
				int Math=100;
				int Software=70;
				int marks=300;
				int obtained=computer+Math+Software;
				int avg=obtained/3;
				System.out.println("the averag is:"+avg+"%");
				
				//If else if statement
				//Calculate the grade for the student
				if (avg>=90 && avg<=100) {
					System.out.println("Grade is A");
				}else if(avg>=80 && avg<=89) {
					System.out.println("Grade is B");
				} else if (avg>=70&&avg<=79) {
					System.out.println("Grade is C");
				}else if(avg>=60&&avg<=69) {
					System.out.println("Grade is D");
				}else {
					System.out.println("This is else block");
				}
				
				//Nested if statement
				if(computer>Math) {
					if (computer>Software) {
						System.out.println("We don't need more computers");
					}else {System.out.println("Upgrate the software");}
				}else if (Math>Software) {
					System.out.println("math is greate");
				}else {
					System.out.println("Upgrate the software");
				}
				
				//Nested if statement
				int a=60;
				int m=300;
				int o=1000;
				
				if(a>m) {
				    if(a>o) {
				    	System.out.println("A is bigger");
				    	}else {System.out.println("O is greater");}
				}else if(m>o) {
					System.out.println("M is bigger");
				}else {
					System.out.println("O is bigger");
				}
				
				
				
				int dw=8;
				switch(dw){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Not a valid day");
				}
					
		
		
		
		
		

	}

}
