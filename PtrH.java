/* Print like this
    1
   000
  11111
 0000000
111111111
*/
import java.util.Scanner;
class PtrH
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
			int k;
			if(i%2==0)
				k=0;
			else
				k=1;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}