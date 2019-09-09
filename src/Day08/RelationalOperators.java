package Day08;

public class RelationalOperators {
	/*
	 Relational Operators: Gives boolean expression(True, False)
	 	> :
	 	>=:
	 	< :
	 	<=:
	 	==:
	 	!=:
	 	
	 	!: Exclamation mark in java means the logical opposite
	 	
	 
	 */
	
	public static void main(String[] args) {
		System.out.println(10>9); // true
		boolean resultA = 10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9); //true
		boolean resultB = 10>=9;
		System.out.println(resultB);
		
		boolean resultE = 1000<1000;
		System.out.println(resultE);
		
		
		// == : equal
		
		boolean resultG = 19 == 19;
		System.out.println(resultG);
		
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		boolean A = true ==!false;
		System.out.println(A);
		
		boolean B =!true;
		System.out.println(B);
		/*
		 in java
		  true = true, 
		  false=false
		 !false=true
		 !true=false
		 
		 so: !false != !true 
		 */
		
		boolean C = !false != !true;
				System.out.println(C);
		
		
		
		
		
	}

}
