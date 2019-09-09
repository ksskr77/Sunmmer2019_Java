package Day15;

public class WarmUp {
	public static void main(String[] args) {
		
		int num = 9;
		String result = " ";
		
		if(num>=0 && num<=9) {
			
			if(num == 9 )
				result = "Nine";
			else if(num == 8) 
				result = "Eight";
			else if(num==7) 
				result = "seven";
			else if(num == 6) 
				result = "Six";
			else if(num == 5) 
				result="Five";
			else if(num == 4) 
				result = "Four";
			else if(num == 3) 
				result = "Three";
			else if(num == 2) 
				result = "Two";
			else if(num ==1 ) 
				result = "One";
			else 
				result = "Zero";
			
			
		}else {
			result = "invalid";
		}
		System.out.println(result);
		
		
		
		int n = 0;
		String result2 = (n==9)? "nine" 
				:(n==8)? "eight"
					:(n==7)? "seven"
						:(n==6)? "six"
							:(n==5)? "five"
								:(n==4)? "four"
									:(n==3)?"three"
										:(n==2)?"two"
											:(n==1)?"one"
												:(n==0)?"zero"
													:"Invalid";
		
		System.out.println(result2);
		
		
		
		
		
		
		
		
	}

}
