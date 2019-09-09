package Day14;

public class Ternary {

	public static void main(String[] args) {
		
		/*
		 Ternary: you can only give single value in ternary body 
		 
		 ternary MUST be initialized to a variable
		 
		 if(condition)              ==> (condition)?
		 else                       ==>  :
		 else if(condition)         ==>  :(condition)? 
		  
		 
		 
		 */
		
		int num = 0;
		num = (true)? 100 : 50;
		
		
		System.out.println(num);
		
		
		int  n = (true) ? 100: 50 ;
		System.out.println(n);
		
		
		String Schoolname= "";
		
		boolean Batch12 = true;
		
		
		if(Batch12) {
			Schoolname="Cybertek";
		}else {
			Schoolname="invalid";
		}
		
		
		System.out.println(Batch12? "Cybertek":"Invalid");
		String School = Batch12? "Cybertek":"Invalid";
		System.out.println(School);
		
		
		double d = 20;
		if(true) {
			d=10.5;
		}
		
		double z = true ? 10.5: 3; 
		// in ternary, the number of ? and : must equal.
		
		
		double interestRate = 0;
		boolean GoodCredit = true;
		
		interestRate = GoodCredit == true ? 0.5 : 0.9;
		
		System.out.println(interestRate);
		
		
		byte grade = 60;
		boolean Passed = grade>=60 ? true:false;
		System.out.println(Passed);
		
		
		
		
		char FinalGrade = 'A';
		String Group = "";
		/*
		if(FinalGrade == 'A') {
			Group="Early bird";
		}else if(FinalGrade == 'B') {
			Group = "Group 1";
		}else if(FinalGrade == 'C') {
			Group="Group 2";
		}else {
			Group = "After Group 2";
		}
		*/
		
	Group = (FinalGrade == 'A') ? "Early bird" 
				: (FinalGrade == 'B')? "Group 1"
						:(FinalGrade == 'C')? "Group 2" 
								:"After Group 2";
	System.out.println(Group);
		
		
		int score = 110;
		char Finals = ' ';
		
		Finals = (score>= 90 && score <= 100)? 'A'
				:(score >=80 && score <= 89)? 'B'
						:(score>=70 && score <=79)?'C'
								:(score>=60 && score<=69)?'D'
										:(score>=0 && score <=59)?'F'
												:' ';
		System.out.println(Finals);
						
		int n1 = 10000, n2 = 3000, n3 = 400;
		
		
		int max = (n1>n2 && n1>n3)? n1
				: (n2>n1 && n2 >n3)? n2
						:n3;
		System.out.println(max);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
}
