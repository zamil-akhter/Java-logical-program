/* Print like this
    1
   121
  12321
 1234321
123454321
*/
import java.util.Scanner;
class PtrJ
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
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k+" ");
				if(j<i)
				{
					k++;
				}
				else
				{
					k--;
				}
			}
			System.out.println();
		}
	}
}