package Day04;

public class PrimitiveDataTypes2 {

	/*
	 Primitives = byte, short, int, long, float, double, boolean, char
	 
	 boolean = true or false
	 
	 char = ASCII Table = a universal system that recognized by all computers
	 					  each characters have a corresponding numbers
	 char = declare with in the single quote ''; single character only
	 */
	
	public static void main(String[] args) {
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9>3;
		boolean result4 = 0>0;
		boolean result5 = 2000000000>4;
		boolean result6 = 3>8;
		boolean result7 = 4>=5;
		boolean result8 = 3<=5;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
	    
		
		char char1 ='a';
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n\n\n");
		char char5 = 66; //only time we use '' for char is when we are declaring single character
		System.out.println(char5);
		
		char char6 = 'C';
		System.out.println(char6);
		
		char char7 = 123;
		System.out.println(char7);
		char char8 = '{';
		System.out.println(char8);
		
		// initializing char to other primitives: byte, short, int, long, float, double
		char MyChar1 = 'b';
		
		int MyInt = MyChar1; //the number that represent b is initialized to the int
		System.out.println(MyInt); // gives 98
		
		byte MyByte = 'b'; //if you assign variable name to the byte, it give complie error, because of the memory
							//you can only give single character with in '' to byte
		byte MyByte2 = 'b';
		System.out.println(MyByte2);
		
		//short ShortNum = MyChar1; // char's memory could be bigger than short, range is greater than short
		short ShortNum2 = 'b'; //b's corresponding number is 98 from ASCII Table
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1;
		long LongNum2 = 'b';
		System.out.println(LongNum);
		
		float FloatNum = MyChar1;
		float FloatNum2 = 'b';
		System.out.println(FloatNum2); //98.0
		
		double Dnum = MyChar1;
	    double Dnum2 = 'b';
	    System.out.println(Dnum2); //98.0
	    
	    char a = 'o';
	    System.out.println(a); // character a
	    
	    char MyNum = 23;
	    System.out.println(MyNum);
		
	   
	}
	
}
