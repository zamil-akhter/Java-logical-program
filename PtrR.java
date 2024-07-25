/* Print like this
   1
  121
 12321
1234321
 12321
  121
   1
*/
import java.util.Scanner;
class PtrR
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
		int sp=n/2, st=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(k+" ");
				if(j<=st/2)
					k++;
				else
					k--;
			}
			if(i<n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}
	}
}