/*
  WAJPT insert one array element inside another array from specified index
*/
import java.util.Scanner;
class ArrR
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
	static int readIndex()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index value from where you want to put next array : ");
		int n = sc.nextInt();
		return n;
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
	static int[] insertArray(int a[], int b[], int c)
	{
		if(c<0 || c>a.length)
		{
			return a;
		}
		int d[] = new int[a.length + b.length];
		for(int i=0;i<b.length;i++)
		{
			d[c+i]=b[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i<c)
				d[i]=a[i];
			else
				d[i+b.length]=a[i];
		}
		return d;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the first Array ");
		int x[] = readArray();
		System.out.println("Enter the Second Array ");
		int y[] = readArray();
		System.out.println("Entered First Array : ");
		printArray(x);		
		System.out.println("Entered Second Array : ");
		printArray(y);
		int z = readIndex();
		int finalar[] = insertArray(x,y,z);
		printArray(finalar);
	}
}