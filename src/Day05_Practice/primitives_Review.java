package Day05_Practice;

public class primitives_Review {
	
	/*
	 Primitives: 
	  		byte: only takes whole number
	  		short: only takes whole number
	  		int: only takes whole number
	  		long: only takes whole number
	  		float: can take decimals (MUST have F or f at the end)
	  		double: can take decimals
	  		
	  		boolean: true or false boolean expressions
	  		char: characters within single quote''
	  				also take numbers
	  
	 
	 */
	
	public static void main(String[] args) {
		
		byte bNum = 127; //byte range is -128 ~127
		
		//byte bNum1 = 126.5; //byte only takes whole numbers
		
		
		//short sNum = 2134.3; // short only takes whole numbers
		short sNum2 = 1223;
		
		sNum2 = bNum;
		System.out.println(sNum2);
		
		short sNum3 = 127;
		// byte bNum5 = sNum3; WRONG // shorts> byte
		
		
		int intNum = 100;
		//int intNum2 = 100.5; //int only takes whole numbers
		
		//byte ByteNum = intNum; WRONG // int>byte
		//short ShortNum = intNum; WRONG // int>short
		
		short ShortNum2 = 105;
		intNum = ShortNum2;
		
		System.out.println(intNum);
		
		
		
		long LongNum = 100l;
		long LongNum2 = 100L;
		
		boolean result = true;
		boolean result2 = false;
		
		boolean result3 = 9>10;
		
		//char: takes character, char values MUST be declared within single
		
		char character1 = 'A';
		System.out.println(character1); // print A
		
		
		//char character2 = a;
		//char character3 = 'AA'; only a single character can be declared
		
		// all the characters have representive number:
		
		char charvalue = 98;
		System.out.println(charvalue);  // print some character
		
		int num3 = 'B';
		System.out.println(num3); // print 66
		
		float fnum = 'B';
		System.out.println(fnum);  // print 66
		
		//float:
			float fnum2 = 5.5F;
			float fnum3 = 5;
		
		
		char specialCharacter = 55000;
		System.out.println(specialCharacter);
		
		
		// practices:
		
		/*
		 
		 8, 9, #, @, 8.5,  5.5F,
		 
		 128,  40000,   9>10,  true,  false
		 
		 */
		
		
		byte bnum = 8; short snum = 8; int inum = 8; long lnum = 8;
		
		float Fnum= 8f; double dnum = 8; char cnum = 8;
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		
		System.out.println(Fnum);
		System.out.println(dnum);
		
		System.out.println(cnum);
		
		
		
		
		
	}

}
