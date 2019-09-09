package Day06_ArithmathicOrporators;

public class boolean_Practice {
		public static void main(String[] args) {

			
			        String a = new String();
			        String b = a;
			        String c = b;
			        String d = c;

			        boolean b1 = a == b;
			        boolean b2 = b.equals(b + "!");
			        boolean b3 = !c.equals(a);

			        if (b1 && b2 && b3) {
			            System.out.println("Success!");
			        
			        }
			            
			    }

}
