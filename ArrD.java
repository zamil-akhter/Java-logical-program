/*WAJP to enter n Inter value from the user after that print how many even and odd number are present*/
import java.util.Scanner;
class ArrD
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the Array Size : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter "+n+" values");
		for (int i=0;i<n;i++ ) 
		{
			ar[i] = sc.nextInt();
		}
		int ecount=0, ocount=0;
		for (int i=0;i<n;i++) 
		{
			if(ar[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		System.out.println("Total Even Number from Entered Array is : "+ecount);
		System.out.println("Total Odd Number from Entered Array is  : "+ocount);
	}
}