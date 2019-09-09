package Day12;

public class Switch_Statement {
	/*
	 
	switch statement does the similar thing like
	multi-branch if statement
	
	 switch(Expression){
	 	case CaseValue:
	 			statements1
	 			statements2
	 			break;
	 	
	 	default:
	 		statement;
	 	
	 	}
	 
	 
	 
	 */
	public static void main(String[] args) {
		
	
	int score = 1;
	if(score ==1) {
		System.out.println("1");
		
	}
	else if(score == 2) {
		System.out.println("2");
	}
	
	
	switch(score) {
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		default:
			System.out.println("invalid");
			break; //closing statement
			
	
	}
	
	//break: exiting the switch statement
	//  closing statement
	
	
	String str = "Java";
	switch (str) {
	
	default:
		System.out.println("invalid");
		
	
	case "C#":
		System.out.println("C# programming language");
		
	case "python":
		System.out.println("python programming language");
		
		
		char grade = 'A';
				switch (grade) {
				
				default:
					System.out.println("Failed");
				case 'B':
					System.out.println("passed with B");
					
				case 'C':
					System.out.println("passed with A");
					
				}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
