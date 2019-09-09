package Day15;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		
		String fullname = lastName+" "+firstName;
		System.out.println("Your full name is: \n"+fullname);
		
		System.out.println("Enter char value");
		char ch = input.next().charAt(3);
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
