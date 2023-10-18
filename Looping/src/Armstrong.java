
public class Armstrong {

    public static void main(String[] args) {
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    	System.out.println("enter a integer number");
		int n1=sc.nextInt();

        int originalNumber, remainder, result = 0;

        originalNumber = n1;

        while (originalNumber > 0)
        {
            remainder = originalNumber % 10;
            result += remainder*remainder*remainder;
            originalNumber /= 10;
        }

        if(result == n1)
            System.out.println(n1 + " is an Armstrong number.");
        else
            System.out.println(n1 + " is not an Armstrong number.");
    }
}
