
public class IfElse_1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if(a>=13 && a<=19) {
			System.out.println("You are Teenager!");
		}else {
			System.out.println("You are NOT Teenager!");
		}
		
//		if(a>=13 && a<=19) System.out.println("You are Teenager!");
//		else System.out.println("You are NOT Teenager!");
		
		System.out.println("Thanks for using APP");
	}

}