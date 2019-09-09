package Day15;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter yout first number");
		int num = input.nextInt();
		
		System.out.println("Enter your second number");
		int num2 = input.nextInt();
		
		System.out.println("Enter your third number");
		int num3 = input.nextInt();
		
		
		String Largest = (num>num2 && num>num3)?"num is the larest num"
				:(num2>num&&num2>num3)? "num2 is the largest num"
						:"num3 is the largeset num";
		
		
		System.out.println(Largest);
		
		
		
	}

}
