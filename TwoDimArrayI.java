/*
	WAJPT define a method to return diagonal wise biggest
*/
import java.util.Scanner;
class TwoDimArrayI
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
	static int[] diagonalWiseBiggest(int a[][])
	{
		if(a[0].length==a.length)
		{
			int b1=a[0][0], b2=a[0][a[0].length-1];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(i==j && a[i][j]>b1)
						b1=a[i][j];
					else if(i+j==a.length-1 && a[i][j]>b2)
						b2=a[i][j];
				}
			}
			int b[] = {b1,b2};
			return b;
		}
		else
			System.out.println("\nPlease Enter Only Square Matrix \n");
			return null;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the Array :");
		int a[][] = readArray();
		System.out.println("Entered Array :");
		printArray(a);
		int b[] = diagonalWiseBiggest(a);
		System.out.println("Biggest in Forward Diagonal "+b[0]+"\nBiggest in Backward Diagonal "+b[1]);
	}
}