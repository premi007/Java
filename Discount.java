import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n >= 100 && n < 1000 && n % 2 == 0 && n % 5 == 0)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}
}
