/* Print like this
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
class PtrP
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
		int sp=n/2, str=1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=str;j++)
			{
				System.out.print("* ");
			}
			if(i<=n/2)
			{
				sp--;
				str=str+2;
			}
			else
			{
				sp++;
				str=str-2;
			}
			System.out.println();
		}
	}
}