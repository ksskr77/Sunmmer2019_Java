package Day03_variables;

public class EscapeSequesces {
	/*
	 \n: starts a new line
	 \t: gives tab
	 \\: gives backslash \
	 \': gives '
   \"\": gives ""
	
	
	
	 */
	
	public static void main(String[] args) {
		String str = "Game of Throne";
		System.out.println("Hello Cybertek\n Batch 12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\n");
		System.out.print("False\n\n\n");
		
		System.out.println("\tClass \tstarts tomorrow");
		
		System.out.println("\\sunsoo");
		System.out.println("\'Java");
		
		System.out.println("Book is called "+ str);
	}
}
