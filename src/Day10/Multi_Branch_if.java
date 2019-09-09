package Day10;

public interface Multi_Branch_if {

	/*
	 if -else if-else:
	 			if(condition1){
	 				//A ==>  if condition1 is true
	 			}
	 			if else(condition2){
	 				//B ==> if condition 1 is false and condition 2 is true
	 			}
	 			else {
	 				//C ==> if condition1 and condition2 are false
	 			}
	 			
	 */
	public static void main(String[] args) {
		
		if(false) {
			System.out.println("if block");
		}
		else if(true) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		/*
		 task 01:
		 	90 <= grade     ==> A
		 	80 <= grade <90 ==> B
		 	70 <= grade <80 ==> C
		 	60 <= grade <70 ==> D
		 	else ==> F
		 
		 */
		
		int grade = 89;
		if (90<=grade) {
			System.out.println("you have made A");
		}
		else if (80<=grade && grade<90) {
			System.out.println("you got a B");
		}
		else if (70<=grade && grade<80) {
			System.out.println("you got a C");
		}
		else if (60<=grade && grade<70) {
			System.out.println("you got a D");
		}
		else {
			System.out.println("you failed");
		}
		

			
		/*
		 task 02:
		 	1. write a program that:
		 		1. 0 ~ 12 ==> good morning
		 		2. 12 ~ 15 ==> good Afternoon
		 		3. 15 ~ 23 ==> good night
		 */
			
		int hour = 9;
		if (hour>=0 && hour<=12) {
			System.out.println("good morning");
		}
		else if (hour>12 && hour<=15) {
			System.out.println("good afternoon");
		}
		else if(hour>15 && hour<23) {
			System.out.println("good night");
		}
		else {
			System.out.println("midnight");
		}
		
		int n1 = 23, n2 = 56, n3 = 56;
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is the biggest number");
		}
		else if (n2>n1 && n2>n3) {
			System.out.println(n2+" is the biggest number");
		}
		else if(n3>n1 && n3>n2) {
			System.out.println(n3+ " is the biggest number");
		}
		else if(n3 ==n2 && n3 >n1){
			System.out.println(n3+" and " + n2 +" are the biggest number");
		}
		else if(n3 == n1 && n3> n2) {
			System.out.println(n3+" and "+n1+" are the biggest number");
		}
		else if (n2 == n1 && n2>n3) {
			System.out.println(n2+" and "+n1+ " are the biggest number" );
		}
		else {
			System.out.println("all the numbers are the same");
		}
			
		
		
		
		
		
	}
	
	
}
