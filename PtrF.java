/* Print like this
    1
   1*2
  1*2*3
 1*2*3*4
1*2*3*4*5
*/
import java.util.Scanner;
class PtrF
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
			int k=1;
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(k+" ");
					k++;
				}					
			}
			System.out.println();
		}
	}
}