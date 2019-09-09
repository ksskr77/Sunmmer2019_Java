package Day08;

public class ShortHand {
/*
 +=: addition assignment
 -=: subtract assignment
 
 
 EX: 7+=8 ==> 7+8=15
 */
	public static void main(String[] args) {
		int a= 9;
		//a = a+3;  // 12
		a+=3; // a= a+3
		
		System.out.println(a);
		
		int b = a+=5; // a=17
		
		System.out.println(b);
		
		int c = a+=b;
		System.out.println(c);
		
		int d = a +=c;  //a=68, d=68, c=34, b=17
		System.out.println(d);
		System.out.println(a);
		
		int e = (d+= b) * 2;
		// e = (d= d+b)*2
		// e = (d= 68+17)*2
		// e = (d= 85)*2
		// e = (d= 85)*2
		// e=170, d=85, b= 17
		System.out.println(e);
		
		int f = b += d *2;
		//  f = b= b+d*2
		//  f = b= 187
		//f=187, b=187
		System.out.println(f);
		
		//-=
		int g = 101;
		int h = g-=1;
		//  h = g= 101-1
		//h = 100, j =100
		System.out.println(h);
		
		
		
		int i = g+=h+5;
		//    = g= g+h+5
		//    = g=100+100+5
		//i=205, g=205
		System.out.println(i);
		
		int j =h+= g%i;
		//  j = h = h+g%i
		//  j = h = 100+205%205
		//  j = 100, h = 100, i = 205, g = 205
		System.out.println(j);
		
		int k = j-= h*2%5;
		//  k = j= j-h*2%5
		//  k = j= 100-100*2%5
		//  k = j= 100-200%5
		//  k = j= 100-0
		//k=100, j=100
		System.out.println(k);
		
		
		//*=
		int A = 100;
		A*=200;
		// A= A*200
		//A= 100*200
		//A=20000
		System.out.println(A);
		
		int B = 100;
		    B*= 100 / 10;
		  //B= 100*100/10
		  //B= 10000/10
		  //B= 1000
		 System.out.println(B);
		 
		 
		 B *= B-=1000;
		 //B*=B-1000
		 //B*=1000-10000=0
		 //B=0
		 
		 int C = 100;
		 C/=5;
		 System.out.println(C);
		 
		 int D=10;
		 //C/=D-10;
		 System.out.println(C);
		 
		 C /=D+10; // 
		 System.out.println(C);
		 
		 // %=
		 
		 int z =10%3; //1
		 int E = 10;
		 E %=2; // E = 10%2
		 //E =0
		 System.out.println(E);
		 
		 int F = 100;
		 F %=2;
		 System.out.println(F);
		 
		 int J = 300;
		 int K = 10;
		 J+=J%=K;
		 
		 // j +=j=j%k
		 // j+= j=0
		 //j= j+0
		 //j=300+0
		 //j=300
		 
		 byte ByteNum = 30;
	     // int Inum = Inum+=ByteNum;  // you must give value to local variable
		 // EX. Inum = 20;
		 
		 
		 
		 
		
	}
}
