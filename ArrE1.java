/*WAJP to enter n Inter value from the user after that print How many prime number are present using Method*/
import java.util.Scanner;
class ArrE1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the the Array Size : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("\nEnter "+n+" values");
		for (int i=0;i<n;i++ ) 
		{
			ar[i] = sc.nextInt();
		}
		int x = countPrime(ar);
		System.out.println("\nTotal Prime Number is "+x);
	}
	static int countPrime(int b[])
	{
		int c=0;
		for(int i=0;i<b.length;i++)
		{
			boolean rs = isPrime(b[i]);
			{
				if(rs)
					c++;
			}
		}
		return c;
	}
	static boolean isPrime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}