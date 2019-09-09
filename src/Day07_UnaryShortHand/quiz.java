package Day07_UnaryShortHand;

public class quiz {
	public static void main(String[] args) {
	// question 1:
		int a1 =30;
		int b2 = a1;
		System.out.println(b2);
		
	//question 2:
		/*
		 System.out.println(a+1);
		 int a =100; gives an error
		 */
		
	// question 3:
		System.out.println("Result A "+0+1);
		//Result A 01
		System.out.println("; Result B"+(1)+(2));
		//; ResultB12
		
	//question 4:
		System.out.println(" 5 + 2 = " +3+4);  //5+2= 34
		System.out.println(" 5+ + 2= "+(3+4)); //5+2= 7
	
	//question 5:
		float FloatNum = 100.98765432f;
		short ShortNum = (byte)FloatNum; //100
	
	//question 6:
		//  byte BNum = 200; // byte' maximum capacity is 127
			int a = 200;
			int b = 2;
			System.out.println(a+b-a*b+a/b);
		
	//question 7:
		System.out.println((3+2*3/3%2));
		
	//question 8:
		int num1=9, num2=0, num3=num1/num2;
		//System.out.println(num3*num1);
	
	//question 9:
		long Lnum = 3_000L;
		double Dnum = (float) Lnum;
		int Inum = (short)Dnum;
		System.out.println(Inum%1000); // 0
		
	//question 10:
		double result1 = 10/3;
		 // result1 = 3;
		System.out.println(result1); // 3
	
	//question 11:
		double result2 = 10.0/3;
		 // result2 = 3.33333333;
		System.out.println(result2); // 3.333333333333
		
	//question 12:
		String str = "10.5"; //String of text
		//int num = (int)str; // String is not primitive 
		
	//question 13:
		

		
		
		
		
	}

	
	
}
