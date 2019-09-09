package Day17_StringClass;

public class StringMethods {
	public static void main(String[] args) {
		
		/*
		 1. String is an object
		 		there are two ways we can create String class object:
		 		1. String literals:
		 				String str = "Cybertek";
		 		2.by using "new" keyword:
		 			String str = new String("Cybertek")
		 		
		 Java Heap: a memory location where all 
		 the objects will be saved at
		 
		 String pool: Located in Java Heap Memory,
		 it's a very special memory location for String literals
		 
		 Everytime of the String object is created by String literals,
		 the object will be saved at String pool
		 
		 Every time if the String object is created by using "new" keyword,
		the object will be saved at Heap memory, out side String pool
		
		 
		 */
		String str1 = "Hello world";
		String str2 = "Hello world";
		
		boolean r1 = str1 ==str2;
		System.out.println(r1);
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		boolean r2 = str3 == str4;
		
		System.out.println(r2);
		
		boolean r3 = str1 == str3;
		System.out.println(r3);
		
		
		/*
		 
		 1. concat 2. Length 3. charAt 4. toUpperCase
		 5. toLowerCase
		 
		 
		 */
		/*concat(str): it takes String, and combines the two Strings
		and returns it as new String Value
		*/
		String a="Cybertek";
		a.concat(" School"); // "Cybertek School"
		
		System.out.println(a);
		a=a.concat(" School");
		System.out.println(a);
		
		String A = "hello", B = "hello ";
		System.out.println(A==B);
		
		String C = "Hello", D= "hello";
		System.out.println(C==D);
		
		
		/*
		 length(): it returns the total number of the characters as 
		 		an int value
		 */
		
		String LongName = "ABCDEFGHIJKLMNO";
		int num = LongName.length();
		System.out.println(num);
		
		/*
		 charAt(): returns the index number
		 */
		
		String x = "fwejlkejlfw";
		int num1 = x.length()-1;
		System.out.println(num1);
		
		String name = "Sunsoo";
		char ch = name.charAt(4);
		System.out.println(ch);
		
		String name2 = "cybertek";
		name2 = name2.toUpperCase();
		System.out.println(name2);
		
		String name3 = "CYBERTEK";
		name3 = name3.toLowerCase();
		System.out.println(name3);
		
		/*
		 trim() = it's used for removing unused spaces
		 */
		
		String s1 = "                   hello";
		s1.trim();
		System.out.println(s1);
		s1=s1.trim();
		System.out.println(s1);
		
		String s2 = "Cybertek          School";
		s2 = s2.trim();
		System.out.println(s2);
		
		
		String s3 ="  ";
		s3=s3.trim();
		System.out.println(s3);
		
		
		
		String s4 = "             Cybertek   School";
		s4 = s4.trim();
		System.out.println(s4);
		
		/*
	 substring(beginning index):
	  			it creates sub value of the String from
	  			the beginning index till the last index
				returns it as a NEW String value
		  
		 */
		String Str = "Cybertek School";
		//            0123456789
		String Str2 = Str.substring(9);
		System.out.println(Str2);
		
		String Address = "Mclean VA 22000";
		String zipcode = Address.substring(10);
		System.out.println(zipcode);
		
		
		/*
		 substring(beginning index, ending index):
		 			it creates the sub value of the String from the
		 			beginning index till ending index.
		 			(ending index num will be excluded)
					then returns it as a NEW String values
		 */
			String Name = "Hello Cybertek School";
				Name=Name.substring(6, 14);// "Cyberte"
			System.out.println(Name);
			
			String fullName = "Cybertek School Batch12";
			//                 0123456789
			String middleName = fullName.substring(9, 15);
			System.out.println(middleName);
			
			
			
			
					
		
	}

}
