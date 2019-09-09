package Day13_review;

public class AssesmentQuiz03 {
	public static void main(String[] args) {
		// Q 01:
		/*
		 age >=18 ==> eligible to vote
		 
		 age>= 70 ==> can vote three times
		 70> age >= 60 ==> can vote twice
		 50> age >=80 ==> can vote one time
		
		 */
		int age = -3;
		if(age>=0) {
		
			if(age>18) {
			
		
				if(age>=70) {
				System.out.println("can vote three times");
			
				}else if(60>age && age>=70) {
				System.out.println("can vote twice");
			
				}else if(age<60 && age>=50) {
				System.out.println("can vote one time");
			
				}else{
				System.out.println("can vote");
			}
			
		}else {
			System.out.println("not eligible to vote");
		}
		}else {
			System.out.println("invalid entry");
		}
		
		
		
	}

}
