/*
	WAJPT define a method to return Column Wise Biggest Elements
*/
import java.util.Scanner;
class TwoDimArrayG
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
	static int[] columnWiseBiggest(int d[][])
	{
		int big[] = new int[d[0].length];
		for(int i=0;i<d[0].length;i++)
		{
			big[i] = d[0][i];
			for(int j=1;j<d.length;j++)
			{
				if(big[i]<d[j][i])
					big[i]=d[j][i];
			}
		}
		return big;
	}
	public static void main(String[] args) 
	{
		int a[][] = readArray();
		printArray(a);
		int b[] = columnWiseBiggest(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Biggest in Column "+(i+1)+"  --->  "+b[i]);
		}
	}
}