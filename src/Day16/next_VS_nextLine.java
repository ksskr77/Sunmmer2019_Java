package Day16;

import java.util.Scanner;

public class next_VS_nextLine {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first name");
	String f= scan.nextLine();
	System.out.println("enter last name");
	String l = scan.next();
	
	System.out.println("your first name is "+f);
	System.out.println("your last name is "+l);
	
}
}
