

public class PrimeNo2
{
   public static void main(String[] args)
   {
	  java.util.Scanner sc=new java.util.Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      int num = sc.nextInt();
      int count=0;
      
      for(int i=2; i<num; i++)
      {
         if(num%i == 0)
         {
            count++;
            break;
         }
      }
      
      if(count==0)
         System.out.println("\nIt is a Prime Number.");
      else
         System.out.println("\nIt is not a Prime Number.");
   }
}


	