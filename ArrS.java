/*
  Define a method to remove the duplicate elements from an Array
*/
import java.util.Scanner;
class ArrS
{
	static int[] readArray()
	{
		System.out.println("\nEnter Size of Array :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter the "+n+" Elements of Aarray");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
	static int[] delDuplicate(int ar[])
	{		
		int br[] = new int[ar.length];
		int n=0;
		for(int i=0;i<ar.length;i++)
		{
			int j=0;
			while(j<n)
			{
				if(ar[i]==br[j])
					break;
				j++;
			}
			if(j==n)
			{
				ar[j]=br[i];
				n++;
			}
		}
		int rs[] = new int[n];
		for(int i=0;i<n;i++)
		{
			rs[i]=br[i];
		}
		return rs;		
	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		System.out.println("Entered Array : ");
		printArray(x);
		int y[] = delDuplicate(x);
		printArray(y);
	}
}