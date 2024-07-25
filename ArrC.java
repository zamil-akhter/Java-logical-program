/*WAJP to enter n Inter value from the user after that print biggest among all these integer*/
import java.util.Scanner;
class ArrC
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
		int big=ar[0];
		for (int i=0;i<n;i++) 
		{
			if(ar[i]>big)
				big=ar[i];
		}
		System.out.println("Biggest Number from Entered Array is : "+big);
	}
}