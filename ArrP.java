/*
  Define a method to print the frequency of Array elements
*/
import java.util.Scanner;
class ArrP
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
	static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
	static void calculateFreq(int ar[])
	{		
		int n = ar.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
				System.out.println(ar[i]+" is "+count+" times");
			}
		}
		
		/* Second Logic
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+" is "+count+ " times");
		}*/


	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		System.out.println("Entered Array : ");
		printArray(x);
		calculateFreq(x);
	}
}