/*print like this
10101
10101
10101
10101
10101
*/

import java.util.Scanner;
class PatternPrint1{
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
			if(j%2==0)
			    System.out.print("0 ");
			else
			    System.out.print("1 ");
		    }
		    System.out.println();
	        }
    }
}