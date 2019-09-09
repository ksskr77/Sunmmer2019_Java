package Day12;

public class Warmup_if_Statement_withoutCurkyBraces {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		int n3 = 10;
		
	if(n1 == n2 && n1 != n3) {
		System.out.println("n1 and n2 are equal");
	}
		else if(n2 == n3 && n2 != n3) {
			System.out.println("n2 and n3 are equal");
		}
		else if( n1 == n3 && n3 != n2) {
			System.out.println("n1 and n3 are equal");
		}
		else if(n1 == n2 && n2 == n3 && n1 ==n3) {
			System.out.println("they all equal");
		}
		
	
	else {
		System.out.println("none of them are equal");
	}
		
	//second solution
	
	int num1 = 7, num2 = 7, num3 = 4;
	
	if(num1 == num2 && num2 == num3) {
		System.out.println("they all equal");
	}else if(num1 == num2) {
		System.out.println("num1 and num2 are equal");
	}else if(num2 == num3) {
		System.out.println("num2 and num3 are equal");
	}else if(num1 == num3) {
		System.out.println("num1 and num3 are equal");
	}
	else {
		System.out.println("they are not equal");
	}
	
	
	//third solution
	int x = 6, y = 4, z = 4;
	
	if(x == y && y == z) {
		System.out.println("they are not equal");
		
		if(x == y) {
			System.out.println("x and y are equal");
		}else if(y == z) {
			System.out.println("y and z are equal");
		}else if(z == x) {
			System.out.println("z and x are equal");
		}
		
	}
	else {
		System.out.println("they are all equal");
	}
	
	int grade = 90;
	
	if(grade<= 100 && grade >0) {
		System.out.println("pass");
		
	if(grade>=60 && grade<70) {
		System.out.println(" with D");
	}else if(grade>=70 && grade<80) {
		System.out.println(" with C");
	}else if(grade>=80 && grade<90) {
		System.out.println(" with B");
	}else if(grade>=90 && grade<=100) {
		System.out.println(" with A");
	}else {
		System.out.println("failed");
	 }
	}
	else {
		System.out.println("invalid");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
