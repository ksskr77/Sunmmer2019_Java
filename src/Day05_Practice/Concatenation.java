package Day05_Practice;

public class Concatenation {
	/*
	 String: represent the sequence of characters, use for storing text
	 String values are surrendered by a double quote
	 
	concatenation: combining, linking things together = creates a STRING
	               achieved by using + operator
	               we can concat any value to String
	 */
	public static void main(String[] args) {
		
		String str = "any text goes here";
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);
		
		String Hello = "Hello World";
		System.out.println(Hello);
		
		String myName = "Cybertek"+" School";
		System.out.println(myName);
		
		String Year = "This is " + 2019;
		System.out.println(Year);
	//EX
		String name = "Sunsoo";
		System.out.println("My Name is "+ name);
		
		/*
		 cucumber is variable 3$
		 tomato is variable name 5$
		 */
		
		int cucumber = 3;
		int tomato = 5;
		
		System.out.println("cucumber is "+cucumber + "$");
		System.out.println("tomato is "+tomato +"$");
		
		String newStr = "100"+10;
		System.out.println(newStr);
		
		System.out.println(1+2+3);  // 6
		System.out.println("1"+2+3);  // 123
		
		//System.out.println("1"+1-3); //"11"-3= txt - 3, wrong
		
		System.out.println("Batch 12"+1+2); //1212
		
		System.out.println(2-1+1+"4"); // 2-1+1 = 2 +"4" = 24
		
		System.out.println("Batch 12" +(1+2)); //Batch 123
		
		System.out.println(1+"123"+4+5); //112345
		
		System.out.println("123"+(4+5)); //1239
		
		System.out.println(1+("1"+2)); //112
		
		System.out.println(4+3-(9+3)); // -5
		
		System.out.println((1+2) +"3"); // 33
		
		String BookName = "I like the book called \'Game of Throne\'";
				System.out.println(BookName);
		
		String myInfo= "My name is \n\tCybertek";
		System.out.println(myInfo);
		
		System.out.println('3'+3); //54
		
		System.out.println("3"+'3'); //if we concat char to string ,
						// "3"+3 = 33
		
		System.out.println(12+'3'); // 63
		System.out.println("2"+3); // 23
		System.out.println('7'+3); //58
		System.out.println('7'+"3"); //73
		
		
		
		
	}
	
	
}
