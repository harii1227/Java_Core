
public class NestedIfElse_1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int a=sc.nextInt();
//		System.out.println("Enter a number:");
//		int b=sc.nextInt();
//		if(a==b) {
//			System.out.println("Both are same numbers");
//		}else {
//			if(a>b) {
//				System.out.println(a+" is Greater");
//			}else {
//				System.out.println(b+" is Greater");
//			}
//		}
//		System.out.println("Thanks for using APP");
//	}
//
//}





//
//System.out.println("Enter a number:");
//int a=sc.nextInt();
//System.out.println("Enter a number:");
//int b=sc.nextInt();
//System.out.println("Enter a number:");
//int c=sc.nextInt();
//
//if(a>b) {
//	if(a>c) {
//		System.out.println(a+" is greatest");
//	}else {
//		System.out.println(c+" is greatest");
//	}
//}else {
//	if(b>c) {
//		System.out.println(b+" is greatest");
//	}else {
//		System.out.println(c+" is greatest");
//	}
//}
//
//System.out.println("Thanks for using APP");
//}
//
//}


//public class NestedIfElseEx3 {
//
//	public static void main(String[] args) {
//		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if(a<=0 || a>120) {
			System.out.println("Invalid Age!");
		}else {
			if(a>=13 && a<=19) {
				System.out.println("You are Teenager!");
				System.out.println("Your age= "+a);
			}else {
				System.out.println("You are NOT Teenager!");
			}
		}
		System.out.println("Thanks for using APP");
	}

}