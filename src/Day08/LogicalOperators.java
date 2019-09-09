package Day08;

public class LogicalOperators {
	
	public static void main(String[] args) {
	
	/*
	 
	 &&: and logic == true  && true == true
	 if only both conditions are true, will true
	 
	 
	 ||: or logic == true || true == true
	 if only one of the condition is true,  will give true
	 
	 */

	boolean ResultA = 9==0 &&"Sunsoo"=="good";
	//               false         false  ==> false
		System.out.println(ResultA);
		
		boolean ResultB = 8>5 && 7==(8-2+1);
		//                true      true  ==> true
		System.out.println(ResultB);
		
		boolean ResultC = !false !=true && !false == !(!true);
		//                     false           true  ===> true
		System.out.println(ResultC);
		
		System.out.println("===============================");
		
	boolean ResultD = 9!=0 || 5!=5;
	//                true     false  ==> true
	
	System.out.println(ResultD);
	
	boolean A = "Monday"=="Funday" || 6==6;
	//                False           true   ===> true
	System.out.println(A);
	
	boolean B = true || false; //==> true
	System.out.println(B);
	
	boolean C = !(8>5) || !("Today"!="Friday");
	     //        false         False  ==> false
	System.out.println(C);
	
	// || && :
	
	boolean D = true && true || false; 
	//              true     || false ==> true
	
	boolean E = !(7>5 && 6 !=5) && (9>5 || 10 > 4);
	          //    false       &&    true   ==> false
	System.out.println(E);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
