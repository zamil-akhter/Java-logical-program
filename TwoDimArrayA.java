/*
	WAJPT define a method to find biggest element from a matrix
*/
import java.util.Scanner;
class TwoDimArrayA
{
	static int[][] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row size : ");
		int r = sc.nextInt();
		System.out.println("Enter the Column size : ");
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
		System.out.println("\nEntered Array : ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int findBiggest(int d[][])
	{
		int big = d[0][0];
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				if(d[i][j]>big)
					big=d[i][j];
			}
		}
		return big;
	}
}
class TwoDimArrayA1
{
 	public static void main(String[] args) 
 	{
 		TwoDimArrayA ta = new TwoDimArrayA();
		int c[][] = ta.readArray();
		ta.printArray(c);
		int e = ta.findBiggest(c);
		System.out.println("\nBiggest Element = "+ta.findBiggest(c));
	}
}
