public class SimpleIntrest {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter principle amount");
		int a=sc.nextInt();
		System.out.println("enter rate of intrest");
		float b=sc.nextFloat();
		System.out.println("enter time period in year");
		float c=sc.nextFloat();
		float d=(a*b*c)/100;
		System.out.println("simple intrest is = " + d);
	}
}


