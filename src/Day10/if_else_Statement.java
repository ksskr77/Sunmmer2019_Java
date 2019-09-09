package Day10;

public class if_else_Statement {

	public static void main(String[] args) {
		/*
		 if & else:
		 	
		 	if(condition){
		 		//A	 :if block only gets executed if the condition is true
		 	}
		 	else{
		 		//B	 :else block only gets executed if the condition is false
		 	}
		 
		 
		 
		 
		 */
		

		if(9 <=8) {
			System.out.println("9 is less or equal to 8");
		}
		else {
			System.out.println("9 is greater than 8");
		}
		
	// if 9 is not greater or equal to 8, 9 is must be less than 8
	
		if(false == !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 task 01:
		 	if score < 60 ==> failed
		 	if score >=60 but score < 90 ==> pass
		 	if score >= 90 ==> passed with distinction
		 
		  
		 
		 */
		int score = 60;
		if(score>=60) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		/*
		 1. triangle: has 3 angles and sum of 
		 			three angles must be equal to 180.
		 2. declare 3 variables called angle 1, angle 2, angle 3
		 3. write a program to check if the triangle is valid or not
		 
		 
		 */
		System.out.println("===========");
		
		int A = 1, B = 178, C = 1;
		if (178<A || 178<B || 178<C) {
			System.out.println("the triangle is invalid");
		}
		else if (A+B+C == 180){
			System.out.println("triangle is valid");
		}
		else{
			System.out.println("triangle is valid");
		}
		
		
		/*
		 multi-branch 
		 	if(condition1){
		 			//A
		 			 
		 	}else if(condition2){
		 			//B
		 	
		 	}else{
		 		//C
		 	}
		 	if condition 1 is true ==> A
		 	if else condition 2 is true ==> B
		 	if condition 1 and condition 2 i
		 	
		
		 */
		
		
		

	}
}
