/*WAJP to enter n Inter value from the user after that print sum of all elements*/
import java.util.Scanner;
class ArrF
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
		int sum=0;
		for (int i=0;i<n;i++ ) 
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum of All Entered Number = "+sum);
	}
}