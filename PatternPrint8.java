/*print like this
10001
01010
00100
01010
10001
*/
import java.util.Scanner;
class PatternPrint8
{
    public static void main(String[] args)
    {
	System.out.println("Enter value of n");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	methPattern(n);
    }
    static void methPattern(int n)
    {
	for(int i=1;i<=n;i++)
	{	    
	    for(int j=1;j<=n;j++)
	    {
		if(i==j || i+j==n+1)
		    System.out.print("1 ");
		else 
		    System.out.print("0 ");
	    }
	    System.out.println();
        }
    }
}