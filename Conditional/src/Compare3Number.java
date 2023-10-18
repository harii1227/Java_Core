
public class Compare3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		System.out.println("enter a number");
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println(a+" is greatest");
		else if(b>c)
			System.out.println(b+" is greatest");
		else
			System.out.println(c+"is greatest");

	}

}
