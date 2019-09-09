package Day14;

import java.util.Scanner; // import single class only from java.util package

//everything in scanner class is imported

import java.util.*; //import everything in java

public class ScannerClass {
	public static void main(String[] args) {
		/*
		Scanner: it's a class that provides the methods to
					get user inputs
		Scanner class presented in package "java.util" package
		
		in order to use scanner class, 
		the scanner class MUST be imported: import java.util.Scanner;
		
		the import statement MUST be place between package and class Name
		
		declaration of Scanner:
				Scanner VariableName = new Scanner(System.in);
				
				VariableName: can reference an object of the scanner class
					
				new Scanner(System.in); = created the object of the scanner class
				
				methods of scanner class:
						VariableName.nextByte()
							allows user to enter Byte value
							
							
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Byte Value 1");
			byte byteNum = 	input.nextByte();
			
			System.out.println("You have entered: "+byteNum);

			System.out.println("Enter abother byte value");
			byte byteNum2 = input.nextByte();
		
			System.out.println("You have entered: "+byteNum2);
		
			System.out.println("Addition is: "+(byteNum+byteNum2));
				
				
				
				
				Scanner java = new Scanner(System.in);
				System.out.println("Write your DOB");
					double num = java.nextDouble();
					
					System.out.println("your DOB is "+num);
					
					System.out.println("Enter your favorite number");
					int num2 = java.nextInt();
					System.out.println("Your favorite number is "+num2);
				
				
				
				int appleQuantity = 2;
				String fruit = "banana";
				System.out.println("I ate "+appleQuantity+" apples and 1 "+fruit);
				
				System.out.println("sunsoo's '");
				
				
				
				
	}

}
