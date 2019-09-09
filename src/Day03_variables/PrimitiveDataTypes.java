package Day03_variables;

public class PrimitiveDataTypes {
	
	/*
	 byte: we can assign only integers (no decimal) (-128 to 127)
	 
	 short: we can only assign integers (-32,768 to 32,767)
	 
	 int (often use): we can only assign integers (-2,147,483,648 to 2,147,483,647)
	 
	 long: only integers (can put l at the end of the number only in long data type
	 
	 		byte < short < int < long
	 
	 		small one can be assigned to larger one
	 
	 
	 float: we can assign decimal numbers (must give f at the end of the number)
	 
	 double(often use) = we can assign decimals (don't need to give anything at the end)
	 
	 */
	public static void main(String[] args) {
		
		byte length = 3;         // byte = data type, length = variable
		System.out.println(length);
		
		byte width = 4;
		System.out.println(width);
		
		//byte num9 = 100; variable names start with alphabet
		
		byte num_and$ = 90;
	    //byte num2 = 128; //will give an error because the number is greater than 127
		
		// byte public = 11; variables names cannot be java reserved words
	    
	    short num = 8;
	    
	    //short num3 = 3200000; //will give an error because it is greater than 32767
	    
	    int num5 = 1000000000; //100,000,000 is not acceptable (only _ $ can be used)
	    
	    int num4 = 1_000_000_000; // acceptable
	    
	    
	   long num3 = 1000000000;
	   int num2 = 10;
	   
	   byte bytenumber =10;
	   short shortNumber = bytenumber;
	   
	   short shortNumber2 = 18;
	   // byte byteNumber2 = shortNumber2; //cannot be accepted because of memory differences
	   
	   int intNumber = -19876;
	   long longNumber = intNumber; 
	   
	   short shortNumber3 = -3000;
	   int intNumber3 = shortNumber3;
	   
	   float floatNumber = 10.2f;
	   double doubleNumber = floatNumber;
	   System.out.println("===================");
	   byte bnum = 10;
	   short snum = 20;
	   int inum = 30;
	   long lnum = 40;
	   
	   System.out.println(bnum);
	   System.out.println(snum);
	   System.out.println(inum);
	   System.out.println(lnum);
	   System.out.println("=====================");
	   float fnum = bnum;
	   float fnum2 = snum;
	   float fnum3 = inum;
	   float fnum4 = 60.7f;
	   
	   System.out.println(fnum);
	   System.out.println(fnum2);
	   System.out.println(fnum3);
	   System.out.println(fnum4);
	   System.out.println("=====================");
	   double dnum = bnum;
	   double dnum1 = snum;
	   double dnum2 = inum;
	   double dnum3 = lnum;
	   
	   System.out.println(dnum);
	   System.out.println(dnum1);
	   System.out.println(dnum2);
	   System.out.println(dnum3);
	   
	}
}
