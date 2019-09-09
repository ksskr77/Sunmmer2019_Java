package Day03_variables;

public class println_vs_print {
	
	public static void main(String[] args) {
		
		// the only characters we can include in name is _ and $
		
		System.out.println("Hello Cybertek"); //prints from new line
		System.out.println("School");
		System.out.println("------------------------");
		
		System.out.print("Hello Cybertek");
		System.out.print(" School"); 
		// printing takes place from where it's left off
		System.out.println();
		System.out.println("------------------------");
		System.out.println("Today is ");
		System.out.print("great day ");

	}
}
