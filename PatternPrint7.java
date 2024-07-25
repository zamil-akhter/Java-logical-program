/*print like this
ABCDE
FGHIJ
KLMNO
PQRST
UVWXY
*/

import java.util.Scanner;
class PatternPrint7
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
	int m=65;
	for(int i=1;i<=n;i++)
	{
	    
	    for(int j=1;j<=n;j++)
	    {
		if(m<65 || m>90)
		    m=65;
		System.out.print((char)m);
		m++;
	    }
	    System.out.println();
        }
    }
}