package Day10;

public class Java_Practice {
	
	public static void main(String[] args) {
		
		int num = 0;
		String str = "zero";
		if(num>0) {
			str = "positive";
			System.out.println(num+" is "+ str);
			
		}
		
		if(num<0) {
			str = "negative";
			System.out.println(num +" is "+ str);
			
		}
		System.out.println(num+" is "+ str);

		System.out.println("==================");
		
		
		int hour = 2;
		int min = 4;
		int sec = 6;
		
		String amOrPm = "pm";
		
		if(hour>24) {
			System.out.println("invalid");
		
		}
		if(min>60) {
			System.out.println("invalid");
		}
		if(sec>60) {
			System.out.println("invalid");
		}
		
		if(hour==24 && min >0 && sec>0) {
			System.out.println("invalid");
		}
		System.out.println(hour+":"+min+":"+sec+" "+amOrPm);//hours:min:sec am
		
		System.out.println("=======================");
		int n1 = 3200, n2 = 32400, n3 = 5400;
		int maximum = 0;
		
		// in order to n1 become a maximum: n1>n2 && n1 > n3
		// in order to n1 become a maximum: n2>n1 && n2>n3
		// in order to n1 become a maximum: n3>n1 && n3>n2
		if(n1>n2 && n1>n3) {
			maximum = n1;
		}
		
		if(n2>n1 && n2>n3) {
			maximum = n2;
		}
		if (n3>n1 && n3>n2) {
			maximum = n3;
		}
		String result = "maximum number between "+n1+", "+ n2+ " and "+ n3+" is "+maximum ;
		System.out.println(result);
		System.out.println("the maximum number between "+n1+", "+n2+" and "+ n3+ " is "+ maximum);
		if(n1>n2 && n1>n3) {
			System.out.println("maximum number is " + n1);
		}
		if(n2>n1 && n2>n3) {
			System.out.println("maximum number is " + n2);
		}
		if(n3>n1 && n3>n2) {
			System.out.println("maximum number is "+ n3);
		}
		System.out.println(maximum);
		
		int a;
		if(true) {
			a=12;
		}
		System.out.println(a);
		
		double B;
		if(true) {
			B=100;
		}
		System.out.println(B);
		
		int statusCode = 206;
		String finalResult = "Invalid Status Code";
		if(statusCode == 200) {
			finalResult = "ok";
		}
		if(statusCode == 201) {
			finalResult = "created";
		}
		if(statusCode == 404) {
			finalResult = "not found";
		}
		
		System.out.println("status code "+ statusCode+" is: "+finalResult);
		
		
		
		//task 05
		
		
		
		
		
		
		
		
	}

}
