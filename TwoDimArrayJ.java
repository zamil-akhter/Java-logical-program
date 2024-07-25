/*
	WAJPT define a method to return row wise sum
*/
import java.util.Scanner;
class TwoDimArrayJ
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
	static int[] rowWiseSum(int d[][])
	{
		int big[] = new int[d.length];
		for(int i=0;i<d.length;i++)
		{
			big[i] = 0;
			for(int j=0;j<d[i].length;j++)
			{
				big[i]=big[i]+d[i][j];
			}
		}
		return big;
	}
	public static void main(String[] args) 
	{
		int a[][] = readArray();
		printArray(a);
		int b[] = rowWiseSum(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Sum of Row "+(i+1)+"  -->  "+b[i]);
		}
	}
}