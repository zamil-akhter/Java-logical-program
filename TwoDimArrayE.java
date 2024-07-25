/*
	WAJPT define a method to return row wise biggest element
*/
import java.util.Scanner;
class TwoDimArrayE
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
	static int[] rowWiseBiggest(int d[][])
	{
		int big[] = new int[d.length];
		for(int i=0;i<d.length;i++)
		{
			big[i] = d[i][0];
			for(int j=1;j<d[i].length;j++)
			{
				if(big[i]<d[i][j])
					big[i]=d[i][j];
			}
		}
		return big;
	}
	public static void main(String[] args) 
	{
		int a[][] = readArray();
		printArray(a);
		int b[] = rowWiseBiggest(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Biggest in Row "+(i+1)+" = "+b[i]);
		}
	}
}