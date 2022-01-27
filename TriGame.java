import java.util.Scanner;
public class TriGame
{
    static void gameRes(int a,int b,int c)
    {
        if((a + b + c) == 180)
        {
            if(a == 60 && b == 60 && c ==60)
            {
                System.out.print("U have secured 3rd price: ");
            }
            else if(a == 90 || b == 90 || c == 90)
            {
                System.out.print("U have secured 2nd price: ");
            }
            else
            {
                System.out.print("U have secured 1st price: ");
            }
        }
        else
        {
            System.out.print("No price");
        }
    }
    public static void main(String[] args) 
    {
    	   // int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the angle for a: ");
        int a = s.nextInt();
        System.out.print("Enter the angle for b: ");
        int b = s.nextInt();
        System.out.print("Enter the angle for c: ");
        int c = s.nextInt();
        gameRes(a, b, c);
    }    
}
