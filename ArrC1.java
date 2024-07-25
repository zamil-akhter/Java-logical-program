/*WAJP to enter n Inter value from the user after that print biggest among all these integer using method*/
import java.util.Scanner;
class ArrC1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size of Array :");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the "+n+" Elements");
		for (int i=0;i<n;i++) 
		{
			ar[i]=sc.nextInt();
		}
		int big = getBig(ar);
		System.out.println("Biggest number is "+big);
	}
	static int getBig(int a[])
	{
		int big=a[0];
		for (int i=0;i<a.length;i++ ) 
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		return big;
	}
}