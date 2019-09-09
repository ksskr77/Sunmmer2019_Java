package Day10;

public class task04 {

	public static void main(String[] args) {
		int statusCode = 0;
		if(statusCode == 200) {
			System.out.println("ok");
			
			if(statusCode == 201) {
				System.out.println("created");
			}
				else if(statusCode == 202) {
					System.out.println("accepted");
				}else if (statusCode == 301) {
					System.out.println("Moved");
				}else if(statusCode == 303) {
					System.out.println("See Other");
				}else if(statusCode == 304) {
					System.out.println("Not Modified");
				}else if(statusCode == 307){
					System.out.println("Temporary");
				}else if(statusCode == 400) {
					System.out.println("Bad Request");
				}else if(statusCode == 403) {
					System.out.println("Forbidden");
				}else if(statusCode == 404) {
					System.out.println("Not Found");
				}else if(statusCode == 410) {
					System.out.println("Gone");
				}else if(statusCode == 500) {
					System.out.println("Internal Server");
				}
		}
				else {
					System.out.println("Error");
				}
	
		int grade = 10;
		if(grade>=60 && grade<=100) {
			System.out.println("pass");
			
			if(grade>=90 && grade<=100) {
				System.out.println("A");
			}else if(grade>=80 && grade<90) {
				System.out.println("B");
			}else if(grade>= 70 && grade<80) {
				System.out.println("C");
			}else if(grade>=60 && grade<70) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		
		else {
				System.out.println("Failed");
			}
		
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
