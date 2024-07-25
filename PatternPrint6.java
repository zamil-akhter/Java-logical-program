/*print like this
12345
67891
23456
78912
34567
*/

import java.util.Scanner;
class PatternPrint6
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
	int m=1;
	for(int i=1;i<=n;i++)
	{
	    
	    for(int j=1;j<=n;j++)
	    {
		if(m>9)
		    m=1;
		System.out.print(m);
		m++;
	    }
	    System.out.println();
        }
    }
}