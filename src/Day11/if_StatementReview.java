package Day11;

public class if_StatementReview {
	
	public static void main(String[] args) {
		
		int year = 2016;
		boolean leapyear = year%4 == 0;
		if(leapyear) {
			System.out.println("year"+" is a leap year");
		}
		else {
			System.out.println("This year is not leap year");
		}
		
		int grade = 45;
		if(grade >=60 && grade<=100) {
			//if this line is false, the other bottom never going to make true
			System.out.println("Pass");
			
			if(grade>=90 && grade<=100) {
				System.out.println(" with an A");
			}else if(grade>=80 && grade<90) {
				System.out.println(" with a B");	
			}else if(grade>=70 && grade<80) {
				System.out.println(" with a C");
			}else{
				System.out.println(" with a D");
			}
			
		}else {
			if(grade<60 && grade>0) {
			System.out.println("Failed");
		}
		}
		//Nested if:1. if condition can be evaluate to multiple
		//           scenarios.
		//         2. if you have require to check in the beginning
		int Grade = 90;
		boolean A = Grade >= 90 && Grade <=100;
		boolean B = Grade >= 80 && Grade <= 90;
		boolean C = Grade >= 70 && Grade <= 80;
		boolean D = Grade >= 60 && Grade <= 70;
		boolean ValidGrade = Grade >=0 && Grade <= 100;
		
		if(ValidGrade) {//to executed the if branch, this MUST be TRUE
			if(A) {
				System.out.println("you made A");
			}
			else if(B) {
				System.out.println("you made B");
			}
			else if(C) {
				System.out.println("you made C");
			}
			else if(D) {
				System.out.println("you made D");
			}
			else {
				System.out.println("Failed");
			}
		
		}else {
				System.out.println("Invalid input");
			
		}
		
		/*
		 
		 declare a variable called Age
		 
		 
		 
		 
		 */
		
		int age = 40;
		boolean GoodPerson = false;
	
		if(age>=18) {
			System.out.println("you can buy milk");
			if(GoodPerson) {
				System.out.println("Alcohol is bad for your health");
			}else {//if GoodPerson == false, && age>=18
				System.out.println("you can buy cigrates");
			if(age>=21) {
				System.out.println("you can buy hookah");
			}
			if(age>=25) {
				System.out.println("you can buy alcohol");
			}
			}
		}else {
			System.out.println("buy milk");
		}
			
		
		/*
		 1. write a program that can find the number of days 
		 	in a month. (Feb 28d days)
		 even number of 30 days: 4, 6
		 odd number of 30 days: 9, 11
		 
		 even number of 31 days: 8, 10, 12
		 odd number of 30 days: 1, 3, 5, 7
		 */
		System.out.println("=======================");
		int month = 3;
		int Year = 202;
		if(month>0 && month <13) {
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("30 days");
			}if(month == 2) {
				if(Year%4 == 0) {
					System.out.println("29 days");
				}else {
					System.out.println("28 days");
				}
			}else {
				System.out.println("31 days");
				
			}
		}else {
			System.out.println("invalid month");
		}
		
		
		System.out.println("========================");
		
		
		
		//if else & else if
		
		if(true) {
			System.out.println("hello");
		}
		else {
			System.out.println("Batch 12");
		}
		
		if(false) {
			System.out.println("hello");
		}else if(true) {
			System.out.println("Batch 12");
		}
		else {
			System.out.println("cybertek");
		}
		
		
		/*
		 if(true){
		 
		 }
		 else{
		 
		 }
		 
		 else if{false){  
  <== giving an error, else if MUST declare right after if statement
		
		 
		 }	 
		 */
		
		int x =10;
		
		if(x >0) {
			System.out.println("greater than 0");
		}
		if(x>5){
			System.out.println("greater than 5");
		}
		if(x==10) {
			System.out.println("equal to 10");
		}
		
		if(true) {
			// only use for 1 condition
		}
		
		
		if(true) {
			
		}else {
			// only use for 2 conditions
		}
		
		
		
		if(true) {
			
		}else if(true) {
			
		}else if(true) {
			
		}else {
			// more than two conditions
		}
		
		
		
		//Nested if: if condition has multiple scnarios
		//           if you have pre-conditions to begin
		if(true) {
			
			if(true) {
				
			}
		}
		
		
		
		
	}

}
