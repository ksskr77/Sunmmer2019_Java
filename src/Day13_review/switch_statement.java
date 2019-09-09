package Day13_review;

public class switch_statement {
	public static void main(String[] args) {
		/*
		int
		switch(expression) {
		
		case Casevalue:
				statement1;
				statement2;
				break;
				
		case caseValue :
				statement1;
				statement2;
				break;
		default:
				statement1;
				statement2;
				break;
		}	
			- we can have many cases as we want
			- caseValue MUST match with the switch expression's data type
			- case is similar to else if
			
			break: used for exiting switch statement.
			
			default: is executed 1. if previous statements were fault
								 2. if there was no break on previous statement
			
			
			in switch statement, none of the statement or blocks are mandatory
		
			
		*/
		
		int num = 5;
		
		switch(num) {
		
			case 7 :
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("invalid entry");
				break;
				
			case 5:
				System.out.println("friday");
				break;
				
				
				
				
		}
		
		String days = "Monday";
		switch(days) {
		
		default:
			System.out.println("invalid");
			
		case"Monday":
			System.out.println("monday is fun day");
			
			
		case"Wednesday":
			System.out.println("wednesday is day off");
			break;
			
		case"Tuesday":
			System.out.println("tuesdays is great day");
			
		
		}
		System.out.println("===================");
		
		/*
		 switch statement:
		 
		 whenever you are writing code and checking if some variable
		 equals different values:
		  			1. you can use multi-branch if
		  			
		  
		  
		 
		 switch statement expression MUST be evaluate
		 to a single value (either character, digits, or text)
		 
		 therefore 4 data types are not accepted:
		 
		 EXAMPLE:
		 
		 double a = 10L, 10D, 10F
		 float a = 10F, 10f
		 long a = 10L, 10l, 
		 boolean result = 10 > 9, 4 == X
		 
		 
		 */
		
		//boolean a = 10>9;
		
		//switch (a) {
		//case a: 
		//	System.out.println("this is a");
		//}
		
		
		
		// or logic: 
			char grade = 'A';
			if(grade == 'A'|| grade == 'B') {
				System.out.println("Paseed the exam");
			}else {
				System.out.println("failed");
			}
		
		System.out.println("=================");
		
		
		switch(grade) {
			case 'A': 
			case 'B':
				System.out.println("Passed the exam");
				break;
				
			default:
				System.out.println("failed");
		}
		
		System.out.println("==============");
		
		
		String US = "USA";
		if( US == "USA" || US == "America" || US == "US") {
			System.out.println("American");
		}else {
			System.out.println("Not American");
		}
		
		System.out.println("===========");
		
		switch(US) {
		
		case "US":
		case "USA":
		case "America":
			System.out.println("American");
			break;
			
		default:
			System.out.println("Not American");
			
		}
		
		String sunsoo = "sunsoo";
		switch(sunsoo) {
		
		case "sunsoo":
			System.out.println("we are having fun");
		case"mina":
				System.out.println("we good");
		}
		
		
		
		
		
		
		
	}
	

}
