package Day16;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		    
		    Scanner scan =new Scanner(System.in);
		    System.out.println("Enter Item1 and its price: ");
		    String item1 = scan.nextLine();
		    double price1 = scan.nextDouble();
		    
		    System.out.println("Enter Item2 and its price: ");
		    String item2 = scan.next();
		    double price2 = scan.nextDouble();
		    
		    System.out.println("Enter Item3 and its price: ");
		    String item3 = scan.next();
		    double price3 = scan.nextDouble();		    
		    
		    String report = "Itme1: ".concat(item1)+" Price: "+price1+
		    				" Itme2: ".concat(item2)+" Price: "+price2+
		    				" Itme3: ".concat(item3)+" Price: "+price3;
		    
		    System.out.println(report);
		    
		    
		    double totalPrice = price1+price2+price3;
		    System.out.println("Total price: "+(totalPrice));
		    
		    
	}

}
