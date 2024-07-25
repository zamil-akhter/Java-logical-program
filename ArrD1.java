/*WAJP to enter n Inter value from the user after that print how many even and odd number are present 
using Methods*/
import java.util.Scanner;
class ArrD1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter The size of Array :");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("\nEnter The "+n+" Elements :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int c[] = countPrime(array);
		System.out.println("\nTotal Even Number =  "+c[0]);
		System.out.println("Total Odd Number  =  "+c[1]);
	}
	static int[] countPrime(int m[])
	{
		int count[]={0,0};
		for(int i=0;i<m.length;i++)
		{
			count[m[i]%2]++;
		}
		return count;
		/*second Logic
		int ec=0, oc=0;
		for(int i=0;i<m.length;i++) 
		{
			if(m[i]%2==0)
				ec++;
			else
				oc++;
		}
		int a[]={ec,oc};
		return a;*/
	}
}