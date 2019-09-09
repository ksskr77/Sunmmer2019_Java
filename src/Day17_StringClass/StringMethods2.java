package Day17_StringClass;

public class StringMethods2 {
	public static void main(String[] args) {
		/*
		 replace(old char, new char):
		 		replaces all the old char values with the given
		 		new char values in the String and returns it as
		 		NEW String value
		 
		 */
		String str1 = "Java is Fun Programming Language";
		
		str1 = str1.replace('a', 's');
		System.out.println(str1);
		
		/*
		 replace(old str, new str):
		 		replace all the old str value with the given
		 		new str values and
		 		returns it as NEW String value
		 
		 
		 
		 */
	
		String str2 = "Today is gonna be a great day to learn java";
		str2 = str2.replace("Today", "Tomorrow");
		System.out.println(str2);
		
		str2 = str2.replace("java","" );
		System.out.println(str2);
		
		/*
		 replaceFirst(): it replaces the first occurred old str with
		  				new str in the string and returns it as a NEW
		  				String value
		 */
		
		
		String s1 = "JAVA is fun, Java is good";
		s1= s1.replaceFirst("JAVA", "Python");
		System.out.println(s1);
		
		s1 = s1.replace("is good", "iS Good");
		System.out.println(s1);
		
		String s2 = "Java is programming language, Java is Java";
		s2 = s2.replaceFirst("Java is Java", "C# is Java");
		System.out.println(s2);
		
	}

}
