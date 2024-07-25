/*
	WAJPT define a method to Transpose of Matrix
*/
import java.util.Scanner;
class TwoDimArrayN
{
	static int[][] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row size : ");
		int r = sc.nextInt();
		System.out.println("Enter Column size : ");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("Enter "+r*c+" Elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
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

	static int[][] transposeMatrix(int c[][])
	{
		int d[][] = new int[c[0].length][c.length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				d[i][j]=c[j][i];
			}
		}
		return d;
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the Array :");
		int a[][] = readArray();
		System.out.println("Entered Array :");
		printArray(a);
		System.out.println("Transposed Matrix :");
		int b[][] = transposeMatrix(a);
		printArray(b);
	}
}