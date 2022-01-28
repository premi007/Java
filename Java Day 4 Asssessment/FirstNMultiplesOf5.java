import java.util.Scanner;
public class FirstNMultiplesOf5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n * 5; i++)
		{
		    if(i % 5 == 0)
		    {
			System.out.print(i + " ");
		    }
		}
	}
}
