import java.util.Scanner;
public class FirstNMultiplesOf3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n * 3; i++)
		{
		    if(i % 3 == 0)
		    {
			System.out.print(i + " ");
		    }
		}
	}
}
