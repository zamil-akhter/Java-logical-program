/*print like this
11111
00000
11111
00000
11111
*/

import java.util.Scanner;
class PatternPrint3
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
		if(i%2==0)
		    System.out.print("0 ");
		else
		    System.out.print("1 ");
	    }
	    System.out.println();
        }
    }
}