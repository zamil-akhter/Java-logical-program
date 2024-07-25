/*
	WAJPT define a method to return how many prime number present in a matrix
*/
import java.util.Scanner;
class TwoDimArrayD
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

	static int countPrime(int d[][])
	{
		int primecount=0;
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				int c=0;
				for(int k=2;k<d[i][j];k++)
				{
					if(d[i][j]%k==0)
						c++;
				}
				if(c==0)
					primecount++;
			}
		}
		return primecount;
	}
	public static void main(String[] args) 
	{
		int a[][] = readArray();
		printArray(a);

		System.out.println("\nTotal Prime Number = "+countPrime(a));
	}
}