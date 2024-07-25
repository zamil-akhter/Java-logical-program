/*
  Define a method to print the frequency of Array elements
*/
import java.util.Scanner;
class ArrP1
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
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
			{
				big=ar[i];
			}
			int count[] = new int[big+1];
			for(int i=0;i<ar.length;i++)
			{
				count[ar[i]]++;
			}
			for(int i=0;i<count.length;i++)
			{
				if(count[i]!=0)
					System.out.println(i+" is "+count[i]+" times");
			}
		}
	}
	public static void main(String[] args) 
	{
		int x[] = readArray();
		System.out.println("Entered Array : ");
		printArray(x);
		calculateFreq(x);
	}
}