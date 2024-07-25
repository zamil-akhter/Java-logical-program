/*
	Define a method to search the specified element from the array 
	if present the return the index else return -1
*/
import java.util.Scanner;
class ArrN
{
	static int[] readArray()
	{
		System.out.println("\nEnter the size of Array :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter the "+n+" Elements of Aarray");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int readSearch()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Element which you want to search :");
		int m = sc.nextInt();
		return m;
	}
	static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
	}
	static int calculate(int a[], int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		System.out.println("Entered Array : ");
		printArray(x);
		int y = readSearch();
		int z = calculate(x,y);
		if(z!= -1)
			System.out.println("It's fount on index no "+z);
		else
			System.out.println("Not fount");
	}
}