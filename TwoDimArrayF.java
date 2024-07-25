/*
	WAJPT define a method to return how many even number and odd number present in the matrix
*/
import java.util.Scanner;
class TwoDimArrayF
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
	static int[] countEO(int c[][])
	{
		int ec=0, oc=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				if(c[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		int d[] = {ec,oc};
		return d;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the Array : ");
		int a[][] = readArray();
		System.out.println("Entered Array : ");
		printArray(a);
		int c[] = countEO(a);
		System.out.println("Total Even no. = "+c[0]+"\nTotal Odd no.  = "+c[1]);
	}
}