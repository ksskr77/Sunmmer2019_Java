package Day15;

public class StringClass {

	public static void main(String[] args) {
		
		
		/*
		 String class: 
		 
		 	1. String is an object
		 		there are two ways to create object from
		 		String class:
		 			1. String literals
		 					String str = "Cybertek";
		 					
		 			2. by using "new" keyword
		 					String str = new String("Cybertek");
		 			
		when the object is created by String literals,
		that object will be saved at String pool
		(String pool does not take duplicates)
		
		When the String object is created by using "new" keyword, 
		the object will be saved at java heap
		
		heap memory = the place where all the object are store at
		
		string pool : located in heap memory,
		stores all string literals'
		 */
		
		
		String str = "Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		System.out.println(A==B);
		
		String str2 = new String("Cybertek");
		System.out.println(str == str2);
		
		String str3 = new String("Cybertek");
		System.out.println( str2 == str3);
		
		String s1 = "cat";
		String s2 = "cat";
		System.out.println(s1==s2);
		
		String s3 = new String("cat");
		String s4 = new String("cat");
		System.out.println(s3==s4);
		
		String a ="Batch12";
		String b = "batch12";
		System.out.println(a==b);
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
