package Day13_review;

public class quizReview {
	public static void main(String[] args) {
		
		// Kahoot
		
		// Q01:
		
		if(!true!= !false) {
			System.out.println("cybertek");
		}else {
			System.out.println("batch 12");
		}
		
		System.out.println("=======================");
		
		
		// Q 02:
		
		boolean resultA = 0 >= 9 || 10<= 10,
				resultB = 'A'>=128 && 'B' < 128;
				
			//	resultA = true || true ==> true
			//  resultB = false && true ==> false
				
				
				if(resultA) {
					
					if(resultB) {
						System.out.println(resultA);
					}else {
						System.out.println(resultB);
					}
					}
			System.out.println("=======================");
			
			// Q 03:
			
			if(true) {
				System.out.println("  ");
			}else if(false) {
				// else block is not mendatory
			}
		
			System.out.println("========================");
			//Q 04:
			int num1 = 9;
			
			if(++num1<10) {
				System.out.println(num1+"hello world");
			}else {
				System.out.println(num1+"hello universe");
			}
		
			System.out.println("=================");
			
			//Q 05:
			
			int x = 1; 
			int y = 0;
			if(x++ > ++y) {
				System.out.print("hello ");
			}else {
				System.out.print("welcom");
			}
			System.out.println(" Log "+x+";"+y);
			
			
			System.out.println("====================");
			
			// Q 06:
			
		//	double y1 = 200;
		//	float flt = y1;  200 with double is decimal and float without f is  just an integer
						//   this cannot be assigned
			
			// Q 07:
			
			boolean result = true;
			int N = 100;
			
			if(result) {
				N/=10; // N = N /10 ==> 10
				result = !result; // result = false
			
			}if(result) {
				//false
				N*=2; // N stays 10
			}else {
				N-=5; //N = N -5 ==> 10 - 5 ==> 5
			}
			
			System.out.println(N);

			
					System.out.println("==================");
					
			// Q 08:
			
			boolean X = true;
			if( X == false) {
				System.out.println("one");
			}
			else if(X == false != true) {
				//  true = (false = false)
				//  true = true
				System.out.println("two");
			}
			
			// Q 09:
			
			// else block is not able to make as many as they can
			
			// Q 10:
			
			int n = 'B'; // corresponding number of the character will be assigned
			System.out.println(n);
			char a = 'A';
			System.out.println(a);
			
			
			
			
			
			
		
		
		
		
	}

}
