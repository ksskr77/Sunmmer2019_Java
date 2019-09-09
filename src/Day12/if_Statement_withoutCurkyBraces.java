package Day12;

public class if_Statement_withoutCurkyBraces {
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("hello");
			
		}else {
			System.out.println("world");
		}
		
		
		//without curly brace
		if(true)
			System.out.println("hello");
		else
			System.out.println("world");
		
		if(true)
			if(true)
				System.out.println("hello world");
			else
				System.out.println("hello cybertek");
		else
			System.out.println("invalid");
		
		
		// multi branch if statement
		int grade = 80;
		if(grade<=100 && grade>=0)
		if(grade>=90) {
			System.out.println("A");
		}else if(grade>=80) {
			System.out.println("B");
		}else if(grade>=70) {
			System.out.println("C");
		}
		
		
	if(grade<=100 && grade>=0)
		if(grade>=90)
			System.out.println("A");
		else if(grade>=80)
			System.out.println("B");
		else if(grade>=70)
			System.out.println("C");
		else if(grade>=60)
			System.out.println("D");
		else
			System.out.println("Failed");
	else
		System.out.println("invalid");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
