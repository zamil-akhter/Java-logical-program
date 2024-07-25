/*WAJP to enter n Inter value from the user after that print How many prime number are present*/
import java.util.Scanner;
class ArrE
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
		int pcount=0;
		for (int i=0;i<n;i++) 
		{
			int count=0;
			for(int j=1;j<=ar[i];j++)
			{
				if(ar[i]%j==0)
					count++;
			}
			if(count==2)
				pcount++;
		}
		System.out.println("Total Prime Number is : "+pcount);
	}
}