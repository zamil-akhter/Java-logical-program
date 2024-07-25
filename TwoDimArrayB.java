/*
	WAJPT define a method to return sum of matrix elements
*/
import java.util.Scanner;
class TwoDimArrayB
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

	static int sumOfElements(int d[][])
	{
		int sum = 0;
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				sum=sum+d[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int a[][] = readArray();
		printArray(a);
		System.out.println("Sum of All Elements = "+sumOfElements(a));
	}
}