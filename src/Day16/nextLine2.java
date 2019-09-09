package Day16;

import java.util.Scanner;

public class nextLine2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter zip-code");
	int zip = scan.nextInt();
	
	scan.nextLine();
	System.out.println("Enter your city name");
	String city = scan.nextLine();
	
	System.out.println("zip-code is: "+zip);
	System.out.println("city name is: "+ city);
	
	System.out.println("enter your phone number");
	int pn = scan.nextInt();
	
}
}
