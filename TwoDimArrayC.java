/*
	WAJPT define a method to add two matrix elements
*/
import java.util.Scanner;
class TwoDimArrayC
{
	static int[][] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row size : ");
		int r = sc.nextInt();
		System.out.println("Enter Column size : ");
		int c = sc.nextInt();
		int ar[][] = new int[r][c];
		System.out.println("Enter the "+r*c+" Elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		return ar;
	}
	static void printArray(int b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int[][] addOfArray(int a[][], int b[][])
	{
		if(a.length!=b.length || a[0].length!=b[0].length)
		{
			System.out.println("Order must be same ");
			return null;
		}
		int c[][] = new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the first Array : ");
		int a[][] = readArray();
		System.out.println("\nEntered first Array : ");
		printArray(a);

		System.out.println("Enter the second Array : ");
		int b[][] = readArray();
		System.out.println("\nEntered second Array : ");
		printArray(b);

		int c[][] = addOfArray(a,b);
		System.out.println("\nArray after Adding: ");
		printArray(c);
	}
}