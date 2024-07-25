/* Print like this
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
*/
import java.util.Scanner;
class PtrI
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		methToPrint(n);		
	}
	static void methToPrint(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
}