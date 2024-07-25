/*
  Define method to print the pair of element to sum is equal to n
*/
import java.util.Scanner;
class ArrQ
{
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n = sc.nextInt();
		int ar[] = new int[n];		
		System.out.println("Enter the "+n+" Elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	static int readSum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sum value of pair : ");
		int s = sc.nextInt();
		return s;
	}
	static int calculatePair(int a[],int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]+a[i+1]==b)
			{
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		int z = readSum();
		int pair = calculatePair(x,z);
		if(pair == 0)
			System.out.println("Not Found");
		else
			System.out.println("index "+pair+" & "+(pair+1)+" is pair of "+z);
	}
}