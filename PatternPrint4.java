/*print like this
abcde
abcde
abcde
abcde
abcde
*/

import java.util.Scanner;
class PatternPrint4
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
	    int a=97;
	    for(int j=1;j<=n;j++)
	    {
		System.out.print((char)a);
		a++;
	    }
	    System.out.println();
        }
    }
}