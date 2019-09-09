package Day06_ArithmathicOrporators;

public class PrimitiveCasting {
	public static void main(String[] args) {
		
		/*
		 casting: converting larger primitive to smaller size
		 			datatype variablename = (datatype) value
		 			
		 			castings : Explicit or Implicit
		 			
		 primitives: byte, short, int, long, float, double
		 
		 */
		//Explicit Casting:
		int a =128;
		byte b = (byte)a; //explicit casting
		
		System.out.println(b);
		
		double DecimalNumber=10.5;
		float FloatNumber = (int) DecimalNumber;
		
		System.out.println(FloatNumber);
		
	long LongNum = 300L;
	
	//  int IntNum = (int) LongNum;
		int IntNum = (short)LongNum;
		
		System.out.println(IntNum);
	
	//Implicit Casting:
		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		
		int IntNum3 = (int) ByteNum;
		
		short ShortNum = 100;
		long LongNum2 = ShortNum;
			//same with:
	long LonNum2 = (short) ShortNum;
	
	
	
	//explicit Casting:
		double LargestNumber = 100.8768;
		byte ByteNum3 = (byte)LargestNumber;
		
		float FloatValue = (int) LargestNumber;
		float FloatValue2 = (short) LargestNumber;
		float FloatValue3 = (byte) LargestNumber;
		float FloatValue4 = (long) LargestNumber;
		float FloatValue5 = (float) LargestNumber;
		
		System.out.println(FloatValue);
	
	float FloatNumber2 = 500.67f;
	
	int myNumber = (int) FloatNumber2;
	//                     500
	System.out.println(myNumber);
	/*
	int Num1 = 100;
	int Num2 = 200;
	int Num3 = 300;
	*/
	int Num1 = 100, Num2 = 200, Num3 = 300;
	System.out.println(Num1 +"\t"+Num2+"\t"+Num3);
	boolean result;
//	System.out.println(result); //Local Variables must be initialized
	
	char Character1= 5;
	System.out.println(Character1);
	
	boolean result1, result2, result3;
//	System.out.println();
	
	char a1 = '5';
	System.out.println(a1);
	int num4 = '5';
	System.out.println(num4);
		
	}

}
