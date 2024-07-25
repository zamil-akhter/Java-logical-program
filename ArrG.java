/*WAJP to define a method to merge two array elements in single array*/
import java.util.Scanner;
class ArrG
{
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++) 
		{
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static void dispArray(int m[])
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]);
			if(i<m.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
	static int[] merge(int a[], int b[])
	{
		int c[] = new int[a.length + b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("\nEnter First Array Elements :");
		int x[] = readArray();
		System.out.println("\nEnter Second Array Elements :");
		int y[] = readArray();
		System.out.println("\nEntered First Array :");
		dispArray(x);
		System.out.println("\nEntered Second Array :");
		dispArray(y);
		System.out.println("\nAfter Merge :");
		int z[] = merge(x,y);
		dispArray(z);
	}
}