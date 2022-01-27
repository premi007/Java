import java.util.Scanner;
public class CountDiv
{
    static int countDiv(int l,int r,int k)
    {
        int count = 0;
        for(int i = l; i <= r; i++)
        {
            if(i % k ==0)
            {
                //System.out.println("Hey");
                count++;
            }    
        }
        return count;
    }
    
	public static void main(String[] args) 
	{
	    int l, k, r;
	    Scanner s = new Scanner(System.in);  
	    l = s.nextInt();
	    r = s.nextInt();
	    k = s.nextInt();
	    System.out.println(countDiv(l, r, k));
	}
}
