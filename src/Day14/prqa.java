package Day14;

import java.util.Scanner;

public class prqa {
public static void main(String[] args) {

	
	
		    //YOUR CODE HERE:
		    
		    Scanner input = new Scanner(System.in);

		    System.out.println("Enter seconds: ");
		    
		    int inputSeconds = input.nextInt();
		    int hours = 123;
		    int minutes = 213;
		    int seconds = 231;
	
	
	System.out.println(inputSeconds/3600+" hours, "+ 
	(inputSeconds%3600)/60+" minutes, and "+(inputSeconds%3600)%60+" seconds");
	
	
	
	
	
}
}
