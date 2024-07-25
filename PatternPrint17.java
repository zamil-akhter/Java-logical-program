/*
a
ab
abc
abcd
abcde
*/
import java.util.Scanner;
class PatternPrint17
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int k=97;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)k+" ");
				k++;
			}
			System.out.println();
		}
	}
}