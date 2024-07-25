/*
WAJPT delete the elements from the specific index
*/
import java.util.Scanner;
class ArrL
{
	static int[] readArray()	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	static void printArray(int b[])	
	{
		System.out.println("Entered Array : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(ar[i]);
		}
	}
	public static void main(String[] args)
	{
		int x[] = new readArray();
		new printArray();

	}
	
	
}