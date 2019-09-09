package Day16;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name and last name");
		String firstname = scan.nextLine(),
				lastname = scan.nextLine();
		
		String fullname = firstname.concat(" "+lastname).toUpperCase();
		

		System.out.println("Your full name is "+fullname);
		
		scan.close();
	}

}
