package Day15;

public class StringMethods {
	public static void main(String[] args) {
		/*
		 2. String object represents the sequences of the characters
				===> "ABCDEFG"
				 each character in String has its own
				 index number. index numbers start from 0
				 
				 String str = "Cybertek"
				index number: 01234556
				 
				 
		3. String is immutable:
			 	once you declare it, you cannot modify it
				 
				 String Method:
				 	charAt(indexnum):
				 
		*/
		
		String str = "Cybertek";
		// index num: 01234567
		
		//charAt(indexnum):
		
		System.out.println(str.charAt(7));
		
		char ch = str.charAt(4);
		
		System.out.println(ch);
		
		String str2 = "Sun soo";
		//index nm     0123456
		
		System.out.println(str2.charAt(3));
		
		System.out.println("=================");
		
// length(): returns the total number of characters as an int value
	
		
		String name = "Donald J Trump";
		System.out.println(name.length());
		
		System.out.println("==============");
		
// concat(str): it takes a String and concats it to the string variable
//              and then returns a NEW String value
//   
		String s1 = "Cybertek";
		s1.concat(" School");
		System.out.println(s1); //String is immutable
		
		s1 = s1.concat(" School");
		System.out.println(s1);

		System.out.println("==============");
		
		
// toUpperCase() : converts to upper case
		
		String N = "cybertek";
			N= N.toUpperCase();
			System.out.println(N);
			
			System.out.println("======================");
//toLowerCase() : converts to lower case
			String A = "CYbERTEK";
			A=A.toLowerCase();
			System.out.println(A);
		System.out.println("===================");
		
		// charAt();, length();, toUpperCase(), toLowerCase(),
			
			String a = "Batch 12 Javengers";
			
			System.out.println(a.charAt(9));
			char ch1 = a.charAt(14);
			System.out.println(ch1);
			
			System.out.println(a.length());
			int HighestIndexNum = a.length()-1;
			System.out.println(HighestIndexNum);
			
			
			System.out.println(a.toUpperCase());
			
			System.out.println(a.toLowerCase());
			
			String b="Cybertek";
			b=b.concat(" Batch12 Javengers");
			System.out.println(b);
			
		
		String e ="JAVA IS FUN";
		e.toLowerCase();
		System.out.println(e);
		
		String f = e.toLowerCase();
		e = e.toLowerCase();
		System.out.println(e);
		System.out.println(f);
		
		
	}

}
