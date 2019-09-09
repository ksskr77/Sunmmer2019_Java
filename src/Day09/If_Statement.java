package Day09;

public class If_Statement {

	/*
	 if statement: 
	 		
	 		single if statement:
	 		
	 			if(boolean expression){
	 			   some codes to run
	 			}
	 		if block only gets executed if the condition is true
	  	
	 */
	
	
	
	
	public static void main(String[] args) {
		
		
		if(9<10) {
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is dayoff");
		System.out.println("Class starts on Monday");
		
		
		}
		
		int a =1000;  //1001
		if(true) {
	//1000 == 1001 ==>false
			a = 2000;
			System.out.println("a is increased");
		}
		System.out.println(a+"\n");
		
		
		int X = 987645320;
		if(X%2 == 0) {
			//true
			System.out.println(X);
			System.out.println(" it's an even number");
			
		}
		
		if(X%2 != 0) {
			//false
			System.out.println(X);
			System.out.println(" it's an odd number");
		}
		
		
		//
		int Y = 2345678;
		
		if(Y%5 == 0) {
			// false
			System.out.println(Y+" can be divided by 5");
			
			
		}
		
		if(Y%5 != 0) {
			// true
			System.out.println(Y+" can't be divided by 5\n\n\n\n");
		
		}
		
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		
		System.out.println(CEO==Kuzzat); //True
		
		if(Kuzzat == CEO) {
			// true
			System.out.println("Great Person in the world");
			System.out.println("First if block");
		}
		
		if(Kuzzat != CEO) {
			// false
			System.out.println("Great Person in the world");
			System.out.println("Second if block");
		}
		
		int TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if(Cybertek == BestSchool) {
			// true
			TotalNumber += 500;  // TotalNumber = 600
		}
		if(Cybertek != BestSchool) {
			// false
			TotalNumber -= 50;
		}
		
		System.out.println(TotalNumber);
		
		
		
		/*
		 1. Declare variable, and initialize user age
		 2. write a program if the user is eligible to vote for Donald Trump 
		 			vote age is 18
		 
		 */
		
		
		int PersonAage = 18;
		int voteage = 18;
		
		if(PersonAage >= voteage ) {
			//true
			System.out.println("\n\n\nyes, eligible to vote");
			System.out.println("have hun with building the wall");
			System.out.println("MAGA");
			
			
		}
		
		if(PersonAage < voteage) {
			//false
			System.out.println("you are not eligible to vote");
			System.out.println("please grow up");
		}
		
		int A = 500;
		int B = 300;
		if(A>B || B>A) {
			System.out.println(true);
		}
		
		
		
	}
	
	
}
