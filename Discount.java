import java.util.Scanner;
public class Discount
{
	float disCal(float i, float st, float t, float n)
	{
		float d1 = 0.0f;
		float d2 = 0.0f;
		d1 = (i * (7.0f / 100)) + (st * (7.0f / 100)) + (t * (7.0f / 100)) + (n * (7.0f / 100));
		float sum = i + st + t + n;
		System.out.println(d1);
		if(sum <= 25000)
		{
			d2 = 0.0f;
		}
		else if(sum >=25001 && sum <= 50000)
		{
			d2 = sum * (5.0f / 100);
		}
		else if(sum >=50001 && sum <= 100000)
		{
			d2 = sum * (7.0f / 100);
		}
		else
		{
			d2 = sum * (10.0f / 100);
		}
		System.out.println(d2);
		if(d1 > d2)
		{
			return d1;
		}
		else
		{
			return d2;
		}
		System.out.println(d2);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of Iron: ");
		float i = sc.nextFloat();
		System.out.println("Enter the amount of Steel: ");
		float st = sc.nextFloat();
		System.out.println("Enter the amount of Tungsten: ");
		float t = sc.nextFloat();
		System.out.println("Enter the amount of Nickel: ");
		float n = sc.nextFloat();
		Discount d = new Discount();
		System.out.println(disCal(i, st, t, n));
	}
}
