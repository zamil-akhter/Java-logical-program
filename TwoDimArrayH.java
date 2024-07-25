/*
	WAJPT define a method to reverse the matrix elements row wise like
	7 8 5 6 2		2 6 5 8 7
	8 5 4 3 5	to  5 3 4 5 8
*/
import java.util.Scanner;
class TwoDimArrayH
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

	static void reverseRowWise(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			
		}
	}
	





	public static void main(String[] args) 
	{
		System.out.println("Eenter the Array :");
		int a[][] = readArray();
		printArray(a);
		


	}
}