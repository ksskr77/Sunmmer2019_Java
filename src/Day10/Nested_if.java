package Day10;

public class Nested_if {
	/*
	 Nested if: 
	 	if(  condition 1  ){
	 		if( condition 2){
	 				//some code
	 		
	 		}
	 	}
	 
	 */
	public static void main(String[] args) {
		if(false) {
			System.out.println("hello cybertek");
			if(false) {
				System.out.println("hello world");
			}else {
				System.out.println("hello team sdet");
			}
		}
		/*
		 grade<60 ==> F
		 60<=grade <70 ==> D
		 70<= grade < 80 ==> C
		 80<= grade < 90 ==> B
		 90<= grade <=100==> A
		 	 
		 */
		int grade = 47;
		if(grade>= 60 && grade>=100) {
			System.out.println("pass ");
			
			if( grade>=90 && grade <=100) {
				System.out.println("with an A");
			}
			else if(grade>=80 && grade<90) {
				System.out.println(" with B");
			}
			else if(grade>=70 && grade<80) {
				System.out.println("with C");
			}
			else{
				System.out.println("with D");
			}
			
			
		}
		else {
			if(grade<60) {
			System.out.println("failed");
		}
			else {//greater than 100
				System.out.println("not valid");
			}
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
