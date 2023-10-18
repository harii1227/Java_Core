
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter number to check number is prime or not");
		int n1=sc.nextInt();
		if(n1>1)
		{
		boolean flag = false;
		for (int i = 2; i <= n1 / 2; ++i) {
			if (n1 % i == 0) {
				flag = true;
				break;
				}
			}
		if (!flag)
			System.out.println(n1 + " is a prime number.");
		else
			System.out.println(n1+ " is not a prime number.");
	}
	else
	{
		System.out.println(n1 +" is not a prime");
	}
}
}


//public class PrimeNo{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("Enter number to check number is prime or not");
//		int n1=sc.nextInt();
//
//		boolean flag=true;
//		for(int x=2;x<=n1-1;x++)
//		{
//			if(n1%x==0)
//			{
//				flag=false;
//				break;
//				
//			}
//		}
//		if(flag)
//			System.out.println(n1 +"is prime number");
//		else
//			System.out.println(n1 +"is not prime");
//		{
//			
//		
//
//	}
//	}
//	}
//
