/*WAJP to enter n double type array value from the user after that print it in reverse order*/
import java.util.Scanner;
class ArrB
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the Array Size : ");
		int n = sc.nextInt();
		double ar[] = new double[n];
		System.out.println("Enter "+n+" values");
		for (int i=0;i<n;i++ ) 
		{
			ar[i] = sc.nextDouble();
		}
		System.out.println("Entered Array in Reverse Order : ");
		for (int i=n-1;i>=0;i--) 
		{
			System.out.print(ar[i]);
			if(i>0)
				System.out.print(",");
		}
	}
}