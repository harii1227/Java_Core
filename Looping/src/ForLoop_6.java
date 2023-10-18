public class ForLoop_6 {
//	public static void main(String[] args) {
//
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int a=1;a<=n;a++) {
//			sum+=a; //sum= sum+a;
//		}
//		System.out.println("Addition: "+sum);
//	}
//}


	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int mul=1;
		for(int a=1;a<=n;a++) {
			mul*=a;
		}
		System.out.println("Product: "+mul);
	}
}

