
public class Compare5Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		System.out.println("enter a number");
		int c=sc.nextInt();
		System.out.println("enter a number");
		int d=sc.nextInt();
		System.out.println("enter a number");
		int e=sc.nextInt();
		 if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { 
		        System.out.println (a);
		    } else if ((b >= c) && (b >= d) && (b >= e)) {     
		        System.out.println ( b);
		    } else if ((c >= d) && (c >= e)) {                  // c >= d,e
		        System.out.println ( c);
		    } else if (d >= e) {                                // d >= e
		        System.out.println ( d);
		    } else {                                            // e > d
		        System.out.println (e);
		    }

	}

}
