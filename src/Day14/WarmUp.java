package Day14;

public class WarmUp {
	public static void main(String[] args) {
		
	
	
	/*
	 1. write a program that can display the days
	 2. monday - java class day
	 	tuesday or friday 0 selenium day
	 	wed and sat - SQL class days
	 
	 
	 
	 */
	
	String day = "Monday";
	switch(day) {
		case "Monday":
		case "Tuesday":
			System.out.println("java class day");
			break;
		case"Wednesday":
		case"Saturday":
			System.out.println("SQL");
			break;
		case"Thursday":
		case"Friday":
			System.out.println("selenium");
			break;
		default:
			System.out.println("day off");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
