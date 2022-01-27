import java.util.Scanner;
public class AgesG
{
	    static void Ages(int[] a, int ages)
	    {
	        for(int i = 0; i < a.length; i++)
	        {
	            if(a[i] < ages)
	            {
	                System.out.println("This age "+ a[i] + " is lesser than your age "+ ages);
	            }
	            else if(a[i] > ages)
	            {
	                System.out.println("This age "+ a[i] + " is greater than your age "+ ages);
	            }
	            else
	            {
	                System.out.println("You both are of same age "+ ages);
	            }
	        }
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your age: ");
	        int ages = sc.nextInt();
	        System.out.println("Enter 5 ages: ");
        	int n = sc.nextInt();
   	        int[] a = new int[n];
	        for(int i = 0; i < a.length; i++)
	        {
	            a[i] = sc.nextInt();
	        }
	       // System.out.println("Enter 5 ages: ");
	       // int n = sc.nextInt();
	        //
	        //int[] a = {10, 20, 30, 40, 50};
	        Ages(a, ages);
	    }
}
