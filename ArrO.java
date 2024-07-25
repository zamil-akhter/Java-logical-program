/*
	Define a method to return how many times 
	specified element present in the array
*/
import java.util.Scanner;
class ArrO
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
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		System.out.println("Entered Array : ");
		printArray(x);
		int y = readSearch();
		int z = calculate(x,y);
		if(z>0)
			System.out.println("It's Present with "+z+" times");
		else
			System.out.println("Not Present");
	}
}