package Day07_UnaryShortHand;

public class UnaryOperators {
	public static void main(String[] args) {
		/*c
		 
		 +: positive
		 -: negative
		 ++: increment
		 --: decrement
		 
		 */
		
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c =+b; //+(-10) = -10
		System.out.println(c);
		
		int d = -c; // -(-10) = 10
		System.out.println(d);
		
		/* increment: increases the value by 1
		   		pre-increment: operator is placed before the variable
		   		
		   		post increment: operator is placed after the variable
		
		   decrement: decreases the value by 1
		*/
		int num1 = 100;
		//++num1;
		System.out.println(++num1);
		
		int num2 = ++num1; //num2 = 102
		System.out.println(num2);
		
		//post increment: it will pass the current value first,
		//                then incremented by 1 for the following step
		
		int IntNum = 100;
		System.out.println(IntNum++); // 100
		System.out.println(IntNum);  // 101
		
		int IntNum2 = IntNum ++; // IntNum2 = 101
		System.out.println(IntNum2);
		
		System.out.println(IntNum); //102
		
		
		int x = 100;
		int y = x++-1; // y = 100-1
		
		System.out.println(y);
		
		//decrement: decreases vaule by 1
		
			//pre-decrement: operator is placed before the variable
						// decreases the value by 1 immediately
		System.out.println("===========");
		int z = 100;
		--z;
		System.out.println(--z);
		
		//post decrement: operator is placed after the variable
		System.out.println("=====================");
		int Z = 100;
		
		System.out.println(Z--); //100
		System.out.println(Z);
		
		System.out.println("==============");
		
		int t = 50;
		t=  --t + t++ + t-- + t++;
		//  49 +  49  +  50  + 49
		System.out.println(t);
		System.out.println("=================");
		
		short s = 4;
		int i = s * 4 - s--;
		System.out.println(i);
		
		System.out.println("==============");
		
		int w=1;//0==>1==>0
		w = -w-- + w++ / -w-- * --w;
		//  -1-- + 1++ / -1-- * --1
		//  -1   + 0   / -1-- * -1
		//  -1   + 0 * -1
		//  -1
		
		int k =50;
		k = --k + k++ + k-- + k++;
	//	k = 49 + 49 + 50 + 49
		//= 147
		System.out.println(k);
		
		x = 2;
		y = x++;
		System.out.println(y);
		
		int j = 4;
		int o = j * 4 - j++;
	//        = 16 - 4
		 System.out.println(o);
		
		
		
		// 1 gallon = 3.785 liters
		
		 int g = 1;
		 double l = g*3.785;
		 
		 System.out.println(g +" gallons equla to "+l+ " liters");
		 System.out.println("===============");
		 
		 double liters = 1;
		 double gallons = liters/3.785;
		 
		 System.out.println(gallons);
		 System.out.println(liters+" Liters equal to "+ gallons+ " gallons"+ " ");
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
