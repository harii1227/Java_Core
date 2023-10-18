public class SquareOfNo {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a number");
		double n1=sc.nextDouble();
		double res=(n1)*(n1);
		double res2=(n1)*(n1)*(n1);
		System.out.println("square of given number is = " + res);//square
		System.out.println("Cube of given number is = " + res2);//cube
	}
}
