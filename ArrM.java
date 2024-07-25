/*
	Define a method to insert the element in the specified index
*/
import java.util.Scanner;
class ArrM
{
	static int readData()
	{
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		return m;		
	}
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
	static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
	}
	static int[] insertInt(int x[], int in, int elem)
	{
		if(in<0 || in>x.length) 
		{
			System.out.println("\nPlease Enter valid Index value : ");
			return x;
		}
		int z[] = new int[x.length + 1];
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				z[i]=x[i];
			else
				z[i+1]=x[i];
		}
		z[in]=elem;
		return z;
	}
	public static void main(String[] args) 
	{ 	
		int arr[] = readArray();
		System.out.println("\nEntered Array : ");
		printArray(arr);	
		System.out.println("\nEnter the element which you want to insert :");
		int elem = readData();
		System.out.println("\nEnter the Index where you want to insert :");
		int index = readData();
		int ars[] = insertInt(arr, index, elem);
		System.out.println("\nNow Array is :");
		printArray(ars);
	}
}*/



/*
	Define a method to insert the element in the specified index
*/
import java.util.Scanner;
class ArrM
{
	public static void main(String[] args) 
	{ 	
		short x = 10;
		x = x*5;
		System.out.println(x);
	}
}